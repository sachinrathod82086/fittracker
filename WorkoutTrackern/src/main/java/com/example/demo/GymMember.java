package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GymMember {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullname;
	private int password;
	private int age;
	private String gender;
	private int weight;
	private int height;
	public GymMember(int id, String fullname, int password, int age, String gender, int weight, int height) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}
	public GymMember () {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "GymMember [id=" + id + ", fullname=" + fullname + ", password=" + password + ", age=" + age
				+ ", gender=" + gender + ", weight=" + weight + ", height=" + height + "]";
	}
	
	

	

}
