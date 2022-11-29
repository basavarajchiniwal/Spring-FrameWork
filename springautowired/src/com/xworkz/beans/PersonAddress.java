package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonAddress {
	@Autowired
	private String street;
	@Autowired
	private String landmark;

	public PersonAddress() {
		System.out.println("Person: Person adress Def contructor");
	}

	public String getLandmark() {
		return landmark;
	}

	public String getStreet() {
		return street;
	}

}
