package com.alien.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alien.demo.model.Alien;
import com.alien.demo.repository.AlienRepo;

@RestController
public class AlienController {
	
	
@Autowired
AlienRepo repo;

	@RequestMapping("/t")
	public Alien showMessage() {
		
		Alien al = new Alien();
		al.setAid(022);
		al.setAname("rahul");
		al.setTech("javaaa");
		repo.save(al);
		return al;
		
	}

	@RequestMapping("/all")
	public List<Alien> getAllAliens(){
		
		return repo.getAll();
	}
	
}
