package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Temple {
	@Autowired
	private String templeName;
	@Autowired
	private String templePlace;
	@Autowired
	 TempleAutowired temp;

	public Temple() {
		System.out.println("Temple default contructor");
	}

	public String gettemplePlace() {
		return templePlace;
	}

	public String getTempleName() {
		return templeName;
	}

	public void displayTempleAutowired() {
		System.out.println("God Name " + temp.getGodName());
		System.out.println("Donation Counter " + temp.isDonationCounter());
	}
}
