package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class States {

	@Autowired
	private String nameOfTheStates;
	@Autowired
	private int noOfDistic;
	@Autowired
	private StatesBengaloreAutowired bengalore;

	public String getNameOfTheStates() {
		return nameOfTheStates;
	}

	public int  getNoOfDistic() {
		return noOfDistic;
	}

	public void showBengaloreDetailes() {
		System.out.println("Bengaore is "+bengalore.getBengaloreIs());
		System.out.println("Original Name "+bengalore.getOriginalName());

	}

}
