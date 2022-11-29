package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	@Autowired
	private String bikeName;
	@Autowired
	private String bikeCompany;
	@Autowired
	private VehicleEngine engine;

	public Vehicle() {
		System.out.println("Vehicle Default Contructor");
	}

	public String getBikeCompany() {
		return bikeCompany;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void displayEngine() {
		System.out.println("Engine Name :" + engine.getEngineName());
		System.out.println("Engine Type :" + engine.getEngineType());
	}

}
