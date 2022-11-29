package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("lg")
public class Tv {
	@Autowired
	private String ownerName;
	@Autowired
	private String brand;
	
	public Tv() {
		System.out.println("inside a Tv def constructor");
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getBrand() {
		return brand;
	}



	
	
	
}
