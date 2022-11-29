package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	private String Name;
	@Autowired
	private float hieght;
	@Autowired
	private PersonAddress adr;

	public Person() {
		System.out.println("Person def Contructor");
	}

	public String getName() {
		return Name;
	}

	public float getHieght() {
		return hieght;
	}

	public void displayPersonAddress() {
		System.out.println("Person LandMark "+adr.getLandmark());
		System.out.println("Person Street "+adr.getStreet());
	}

}
