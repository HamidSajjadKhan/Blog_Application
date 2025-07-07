package org.example.Backend.Model;

import javax.management.relation.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Internote {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
   private String fullname;
   private String emailAddress;
   private String password;
   private String usename;
   @Enumerated(EnumType.STRING)
   private Role role;
   public enum Role{
	   ADMIN,
	   AUTHOR
   }
   
   
   
	
	
}
