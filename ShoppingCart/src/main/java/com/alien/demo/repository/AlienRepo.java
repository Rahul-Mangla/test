package com.alien.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alien.demo.model.Alien;

@Repository
public interface AlienRepo extends CrudRepository<Alien, Integer> {
	
	@Query("from Alien")
	List<Alien> getAll();
	

}
