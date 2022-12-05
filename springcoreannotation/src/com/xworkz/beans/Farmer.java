package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Farmer {
//	@Autowired
//	@Qualifier("farmerName")
	@Value("sachin")
	private String name; // setter
//	@Autowired
//	@Qualifier("farmerAge")
	@Value("30")
	private int age; // constructor
	@Value("Gadag")
	private String place;

	@Override
	public String toString() {
		return "Farmer name=" + name + "\n Farmer age=" + age + "\n Farmer place=" + place;
	}

}
