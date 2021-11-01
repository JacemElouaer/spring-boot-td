package com.example.td1.DAO;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.td1.Model.*;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository <Etudiant, Long>{
	
	
		
		

		
		
}
