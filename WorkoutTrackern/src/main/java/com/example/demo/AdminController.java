package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@Autowired
	private Adminservice service;

	

	@GetMapping("/in")
	public List<Admin> list() {
		return service.listAll();

	}

	@GetMapping("/admins/{id}")
	public ResponseEntity<Admin> get(@PathVariable Integer id) {
		try {
			Admin admin = service.get(id);
			return new ResponseEntity<Admin>(admin, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/in")
	public void add(@RequestBody Admin admin) {
		service.save(admin);
	}

	@DeleteMapping("/admins/{id}")
	public void delete(@PathVariable Integer id) {
		try {
			service.delete(id);
			
		}catch(NoSuchElementException e) {
			System.out.println("can't delete..");
		}
	}
	@PutMapping("/in")
	public void update(@RequestBody Admin a) {
		service.save(a);
	}
	
	
	
	
	

//	@GetMapping("/login")
//	public ModelAndView log() {
//		ModelAndView m=new ModelAndView("loginpage.html");
//		return m;
//	}
//
//	@PostMapping("/adminlogin")
//	public String login(@ModelAttribute Admin a) {
//		System.out.println(a);
//		service.login(a);
//		return "loginpage1";
//	}
//
//	@GetMapping("/register")
//	public String regis() {
//		return "register";
//	}
//
//	@PostMapping("/addworkout")
//	public String addwork(@ModelAttribute Workouts w) {
//		System.out.println(w);
//		serv.register(w);
//		return "redirect:/";
//	}

}
