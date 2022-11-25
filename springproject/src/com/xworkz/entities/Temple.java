package com.xworkz.entities;

import org.springframework.stereotype.Component;


public class Temple {

	public void darshantime() {
		System.out.println("Darshan time is @10:30AM");
		System.out.println("Closing time @10:00PM");
	}

	public String address() {
		System.out.println("Shiradi");
		return "shiradi";

	}

	Boolean prasadAvailable() {
		System.out.println("Prasad is Available");
		return true;
	}
}
