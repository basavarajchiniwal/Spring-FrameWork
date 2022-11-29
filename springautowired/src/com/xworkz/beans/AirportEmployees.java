package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AirportEmployees {
	@Autowired
	private int noOfAccountants;
	@Autowired
	private int noOfSecurities;

	public int getNoOfAccountants() {
		return noOfAccountants;
	}

	public int getNoOfSecurities() {
		return noOfSecurities;
	}
}
