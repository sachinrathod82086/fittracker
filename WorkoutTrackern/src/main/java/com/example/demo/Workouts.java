package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Workouts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String strenghtraining;
	private String crossfit;
	private String cardio;
	public Workouts(int id, String strenghtraining, String crossfit, String cardio) {
		super();
		this.id = id;
		this.strenghtraining = strenghtraining;
		this.crossfit = crossfit;
		this.cardio = cardio;
	}
	public Workouts() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStrenghtraining() {
		return strenghtraining;
	}
	public void setStrenghtraining(String strenghtraining) {
		this.strenghtraining = strenghtraining;
	}
	public String getCrossfit() {
		return crossfit;
	}
	public void setCrossfit(String crossfit) {
		this.crossfit = crossfit;
	}
	public String getCardio() {
		return cardio;
	}
	public void setCardio(String cardio) {
		this.cardio = cardio;
	}
	@Override
	public String toString() {
		return "Workouts [id=" + id + ", strenghtraining=" + strenghtraining + ", crossfit=" + crossfit + ", cardio="
				+ cardio + "]";
	}
	
	
}
