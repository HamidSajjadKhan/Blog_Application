package org.example.Backend.Model;

import java.util.List;

import javax.management.relation.Role;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	private Long id;
   private String fullname;
   private String emailAddress;
   private String password;
   private String username;
   @Enumerated(EnumType.STRING)
   private Role role;
   public enum Role{
	   ADMIN,
	   AUTHOR
   }
   
   @JsonIgnore
   @OneToMany(mappedBy  = "internote",cascade = CascadeType.ALL)
   private List<Post> posts;
   
   
   
	
	
}
