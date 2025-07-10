package org.example.Backend.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.Backend.ImpleService.InternoteImplServ;
import org.example.Backend.Model.Internote;
import org.example.Backend.Service.InternoteService;
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

import io.jsonwebtoken.Jwts;

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
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody Internote internote){
		if(service.getInternoteByEmailAddress(internote.getEmailAddress())){
			return ResponseEntity.badRequest().body("Email address already in use ! please try another one");
		}
		if(service.getInternoteByPassword(internote.getPassword())) {
			return ResponseEntity.badRequest().body("Password already in use ! please try another one");
		}
				
		if(service.getInternoteByUserName(internote.getUsername())) {
			return ResponseEntity.badRequest().body("User name already in use ! please try another one");
		}
			
		if(internote.getPassword().length()<8) {
			return ResponseEntity.badRequest().body("Password must conatin atleast 8 character");
		}
		if(internote.getUsername().length()<8) {
			return ResponseEntity.badRequest().body("Username must conatin atleast 8 character");
		}
		if(!internote.getEmailAddress().contains("@")) {
			return ResponseEntity.badRequest().body("Email address must conatin @ ");
		}
		
		String passwordPattern =  "(?=.*[A-Z])(?=.*[a-z])(?=.*[&-=].+$).{8,20}";
		
		if(!internote.getPassword().matches(passwordPattern)) {
			return ResponseEntity.badRequest().body("Password must contain atleast one lower case letter,upper case letter,digits and one special character");
		}
			
		service.addInternote(internote);
		Map<String, String> response = new HashMap<String, String>();
		response.put("message", "User was added successfull");
		response.put("status", "OK");
		
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Internote internote,Long id){
		
	     Internote existingInternote =	service.getInternoteByEmailAndPassword(internote.getEmailAddress(), internote.getPassword());
	     if(existingInternote==null) {
	    	 return ResponseEntity.badRequest().body("Email address or Password is incorrect");
	       }
	    
	     String token = Jwts.builder()
	    		 .setSubject(existingInternote.getId().toString())   //set id as a subject
	    		 .claim("email", internote.getRole())
	    		 .claim("ROLE", internote.getRole())
	    		 .claim("Post", internote.getPosts())
	    		 .compact();
	     
	     return ResponseEntity.ok(Map.of("token",token,"role",existingInternote.getRole(),"message","Login Successfully"));
	     
	}
	
	
	
}

