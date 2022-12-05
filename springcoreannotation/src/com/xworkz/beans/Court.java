package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Court {
	
	private String type; // using contructor
	@Value("Gadag")
	private String place;// using @value literal way
	private int noOfLawyers;// using setters(methods)
	@Autowired // ref of a component
	private Judge judge;

	public Court(String type) {
		this.type = type;
	}

	public void setNoOfLawyers(int noOfLawyers) {
		this.noOfLawyers = noOfLawyers;
	}

	@Override
	public String toString() {
		System.err.println("Court Example");
		return "Court type=" + type + "\n Court place=" + place + "\n Number Of Lawyers=" + noOfLawyers + "\n judge="
				+ judge;
	}

}
