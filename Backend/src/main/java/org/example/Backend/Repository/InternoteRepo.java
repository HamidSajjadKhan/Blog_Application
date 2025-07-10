package org.example.Backend.Repository;

import org.example.Backend.Model.Internote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InternoteRepo extends JpaRepository<Internote, Long> {

	@Query(value = "SELECT CASE WHEN COUNT(1)>0 THEN TRUE ELSE FALSE END FROM Internote i WHERE i.emailAddress=?1")
	Boolean existByEmailAddress(String emailAddress);
	
	@Query(value = "SELECT CASE WHEN COUNT(1)>0 THEN TRUE ELSE FALSE END FROM Internote i WHERE i.username=?1")
	Boolean existByUserName(String username);
	
	@Query(value = "SELECT CASE WHEN COUNT(1)>0 THEN TRUE ELSE FALSE END FROM Internote i WHERE i.password=?1")
	Boolean existByPassword(String password);
	
	@Query(value = "SELECT i from Internote i WHERE i.emailAddress=?1 And i.password=?2")
	Internote existByEmailAddressAndPassword(String emailAddress,String password);
	
	
	
}



