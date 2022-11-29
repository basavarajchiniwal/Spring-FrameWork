package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stearing {
	@Autowired
	private String type;
	@Autowired
	private int buttons;

	public Stearing() {
		System.out.println("Car:Stearing default constructor");
	}

	public String getType() {
		return type;
	}

	public int getButtons() {
		return buttons;
	}
}
