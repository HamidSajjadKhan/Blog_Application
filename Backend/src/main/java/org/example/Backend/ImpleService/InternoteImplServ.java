package org.example.Backend.ImpleService;

import java.util.List;

import org.example.Backend.Model.Internote;
import org.example.Backend.Repository.InternoteRepo;
import org.example.Backend.Service.InternoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class InternoteImplServ implements InternoteService{

	@Autowired
	private InternoteRepo internoteRepo;
	
	@Override
	public Internote addInternote(Internote internote) {
		// TODO Auto-generated method stub
		return internoteRepo.save(internote);
	}

	@Override
	public void deleteInternote(long id) {
		// TODO Auto-generated method stub
		 internoteRepo.deleteById(id);
	}

	@Override
	public  Internote updateInternote(Internote internote) {
		// TODO Auto-generated method stub
		return internoteRepo.save(internote);
	}

	@Override
	public Internote getInternoteById(long id) {
		// TODO Auto-generated method stub
		return internoteRepo.findById(id).get();
	}

	@Override
	public List<Internote> getAllInternote() {
		// TODO Auto-generated method stub
		return internoteRepo.findAll();
	}

}
