package org.example.Backend.Repository;

import org.example.Backend.Model.Internote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternoteRepo extends JpaRepository<Internote, Long> {

}
