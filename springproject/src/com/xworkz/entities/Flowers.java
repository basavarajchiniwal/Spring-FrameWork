package com.xworkz.entities;

public class Flowers {
	private String rose;

	public Flowers() {
		System.out.println("default constructor for Flower class");
	}

	public String getRose() {
		return rose;
	}

	public void setRose(String rose) {
		rose = "red rose";
		this.rose = rose;
	}

	@Override
	public String toString() {
		this.rose = "red Rose";
		return rose;
	}

}
