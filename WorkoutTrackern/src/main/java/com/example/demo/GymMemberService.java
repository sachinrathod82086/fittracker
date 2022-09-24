package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class GymMemberService {
	@Autowired
	private GymMemberrepository repo;

	public List<GymMember> listAll() {
		return repo.findAll();
	}

	public GymMember getmember(Integer id) {
		return repo.findById(id).get();
	}

	public void save(GymMember gymMember) {
		repo.save(gymMember);
		
	}

	public void deletemember(Integer id) {
		repo.deleteById(id);
		
	}

}
