package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	@Autowired
	private String collageName;
	@Autowired
	private String area;
	@Autowired
	private ColegeGardenAutowired garden;

	public String getCollageName() {
		return collageName;
	}

	public String getArea() {
		return area;
	}

	public void displayGarden() {
		System.out.println("Number of trees " + garden.getNoOfTree());
	}
}
