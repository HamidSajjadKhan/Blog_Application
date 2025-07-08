package org.example.Backend.Controller;

import java.util.List;

import org.example.Backend.ImpleService.InternoteImplServ;
import org.example.Backend.Model.Internote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Internote")
public class InternoteController {

	@Autowired
	InternoteImplServ service;
	@GetMapping("/GetAllInternote")
	public List<Internote> getAllInternote( ) {
		return service.getAllInternote();
	}
	
	@GetMapping("/GetInternote/{id}")
	public Internote getInternote(@PathVariable long id) {
		return service.getInternoteById(id);
	}
	
	@PostMapping("/AddInternote")
	public Internote  addInternote(@RequestBody Internote internote) {
		return service.addInternote(internote);
	}
	
	@DeleteMapping("/Deletenote/{id}")
	public ResponseEntity<?> deleteInternote(@PathVariable long id) {
		Internote existInternote = service.getInternoteById(id);
		if(existInternote!=null) {
			service.deleteInternote(id);
			return ResponseEntity.ok("Internote is deleted Successfully");
		}
		else {
			return ResponseEntity.notFound().build();
		}
      }
	
	@PutMapping("/Updatenote")
	public ResponseEntity<Internote> updateInternote(@RequestBody Internote internote) {
		Internote existInternote = service.getInternoteById(internote.getId());
		if(existInternote!=null) {
			service.updateInternote(internote);
			return ResponseEntity.ok(internote) ;
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	
	
}

