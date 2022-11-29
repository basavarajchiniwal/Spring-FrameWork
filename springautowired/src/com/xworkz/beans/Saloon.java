package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Saloon {
	@Autowired
	private String ownerName;
	@Autowired
	private Tv tv;
	@Autowired
	private double rent;

	public Saloon() {
		System.out.println("default constructor");
	}

	public String getOwnerName() {
		return ownerName;
	}

	/*
	 * public Tv getTv() { return tv; }
	 */

	public void displayTvDetails()
	{
		System.out.println("Saloon: Tv Brand " +tv.getBrand());
		System.out.println("Saloon: Tv OwnerName "+tv.getOwnerName());
	}

	public double getRent() {
		return rent;
	}

}
