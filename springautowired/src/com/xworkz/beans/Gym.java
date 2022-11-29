package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gym {
	@Autowired
	private String gymName;
	@Autowired
	private double gymFees;
	@Autowired
	private GymTrainer gymTrainer;
	
	public String getGymName() {
		return gymName;
	}
	
	public double getGymFees() {
		return gymFees;
	}
	
	public void displayGymTrainer() {
		System.out.println("Trainer Name"+gymTrainer.getGymTrainerName());
		System.out.println("Trainer Age "+gymTrainer.getGymTrainerAge());
	}
}
