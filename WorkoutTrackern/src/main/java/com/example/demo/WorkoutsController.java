package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutsController {
	
	@Autowired
	private Workoutsservice service;
	
	@GetMapping("/workouts")
	public List<Workouts> list() {
		return service.listAll();

	} 
	@GetMapping("/workouts/{id}")
	public ResponseEntity<Workouts> getworkout(@PathVariable Integer id) {
		try {
			Workouts workouts = service.getworkouts(id);
			return new ResponseEntity<Workouts>(workouts, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Workouts>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/workouts")
	public void addworkouts(@RequestBody Workouts workouts) {
		service.save(workouts);
	}
	@PutMapping("/workouts")
	public void update(@RequestBody Workouts w) {
		service.save(w);
	}
	

}
