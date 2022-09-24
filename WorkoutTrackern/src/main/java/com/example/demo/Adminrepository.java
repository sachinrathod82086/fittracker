package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Adminrepository extends JpaRepository<Admin, Integer> {

	void save(Workouts workouts);

}
