package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Charger {
	@Autowired
	private String capacity;
	@Autowired
	private String hpBrand;

	public Charger() {
		System.out.println("Laptop: Charger default contructor ");
	}

	public String getCapacity() {
		return capacity;
	}

	public String gethpBrand() {
		return hpBrand;
	}
}
