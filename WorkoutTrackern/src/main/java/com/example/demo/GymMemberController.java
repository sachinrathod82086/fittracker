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
public class GymMemberController {

	@Autowired
	private GymMemberService service;
	
	@GetMapping("/members")
	public List<GymMember> list() {
		return service.listAll();

	}
	@GetMapping("/members/{id}")
	public ResponseEntity<GymMember> getmember(@PathVariable Integer id) {
		try {
			GymMember gymMember = service.getmember(id);
			return new ResponseEntity<GymMember>(gymMember, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<GymMember>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/members")
	public void addmember(@RequestBody GymMember gymMember) {
		service.save(gymMember);
	}

	@DeleteMapping("/members/{id}")
	public void deletemember(@PathVariable Integer id) {
		try {
			service.deletemember(id);
			
		}catch(NoSuchElementException e) {
			System.out.println("can't delete..");
		}
	}
	@PutMapping("/members")
	public void updatemember(@RequestBody GymMember g) {
		service.save(g);
	}
	

//	@GetMapping("/member")
//	public String mem() {
//		return "loginpage2";
//
//	}
//
//	@PostMapping("/addmember")
//	public String Addmemb(@ModelAttribute GymMember g) {
//		service.membinfo(g);
//		return "loginpage3";
//	}
//	@GetMapping("/")
//	public String show(Model m) {
//		List<GymMember> GymMember =service.getAllGymMembers();
//		
//		return "grmmembers";
//		
//	}
			

		


	

}
