package com.xworkz.entities;

import org.springframework.stereotype.Component;

public class Pg {
	public Pg() {
		System.out.println("entered into default PG");
	}

	boolean isUnisex() {
		System.out.println("Only For Boys");
		return false;
	}

}
