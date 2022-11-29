package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Airport {
	@Autowired
	private String country;
	@Autowired
	private String state;
	@Autowired
	private AirportEmployees employees;
	
	public String getCountry() {
		return country;
	}
	
	public String getState() {
		return state;
	}
	
	public void display() {
		System.out.println("Number of Accounts "+employees.getNoOfAccountants());
		System.out.println("Number Of Securities "+employees.getNoOfSecurities());
	}
	

}
