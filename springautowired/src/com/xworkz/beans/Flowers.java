package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Flowers {
	@Autowired
	private String flowerType;
	@Autowired
	private String color;
	@Autowired
	private FlowersSmell smell;

	public Flowers() {
		System.out.println("def contructor");
	}

	public String getColor() {
		return color;
	}

	public String getFlowerType() {
		return flowerType;
	}

	public void displayFlowersSmell() {
		System.out.println("Lavender smell " + smell.isSmell());
	}

}
