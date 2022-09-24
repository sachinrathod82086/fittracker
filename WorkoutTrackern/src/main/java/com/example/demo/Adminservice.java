package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Adminservice {

	@Autowired
	private Adminrepository repo;

	public void login(Admin a) {
		repo.save(a);

	}

	public List<Admin> listAll() {
		return repo.findAll();
	}

	public Admin get(Integer id) {
		return repo.findById(id).get();
	}

	public void save(Admin admin) {
		repo.save(admin);

	}

	public void delete(Integer id) {
		repo.deleteById(id);

	}
	void update (Admin a) {
		repo.save(a);
	}
	

	

}
