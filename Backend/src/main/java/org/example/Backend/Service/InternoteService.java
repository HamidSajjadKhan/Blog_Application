package org.example.Backend.Service;

import java.util.List;

import org.example.Backend.Model.Internote;

public interface InternoteService {

	public Internote addInternote(Internote internote);
	public void deleteInternote(long id);
	public Internote updateInternote(Internote internote);
	public Internote getInternoteById(long id);
	public List<Internote> getAllInternote();
	
}
