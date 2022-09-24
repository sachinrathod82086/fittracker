package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Workoutsservice {
	@Autowired
	private WorkoutsservicesRepository repo;

	public List<Workouts> listAll() {
		return repo.findAll();
	}

	public Workouts getworkouts(Integer id) {
		return repo.findById(id).get();
	}

	public void save(Workouts workouts) {
		repo.save(workouts);
		
	}

	
	

}
