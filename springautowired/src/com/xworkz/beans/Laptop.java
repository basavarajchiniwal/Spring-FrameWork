package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	@Autowired
	private String laptopBrand;
	@Autowired
	private String laptopOwnerName;
	@Autowired
	private Charger charger;

	public Laptop() {
		System.out.println("default laptop constructor");
	}

	public String getlaptopBrand() {
		return laptopBrand;
	}

	public String getlaptopOwnerName() {
		return laptopOwnerName;
	}

	public void displayCharger() {
		System.out.println("Laptop: capacity of Charger :"+charger.getCapacity());
		System.out.println("Laptop:Hp Charger Brand :"+charger.gethpBrand());
	}
}
