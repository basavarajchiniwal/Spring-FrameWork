package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private String nameOfCar;
	@Autowired
	private  int noOfDoors;
	@Autowired
	private Stearing stear;

	public Car() {
		System.out.println("Car default contructor");
	}

	public String getNameOfCar() {
		return nameOfCar;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void displayStering() {
		System.out.println("Car: stearing Type "+stear.getType());
		System.out.println("Car: Stearing Buttons "+stear.getButtons());

	}
}
