package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HumanNature {
	@Autowired
	private String natureType;

	public HumanNature() {
		System.out.println("HumanNature: def contructor");
	}

	public String getNatureType() {
		return natureType;
	}
}
