package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HospitalDoctor {
	@Autowired
	private String name;
	@Autowired
	private String specialist;

	public String getName() {
		return name;
	}

	public String getSpecialist() {
		return specialist;
	}

}
