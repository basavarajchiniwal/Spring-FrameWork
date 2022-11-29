package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomeProperty {
	@Autowired
	private boolean mainDoor;
	@Autowired
	private boolean kitchen;

	public HomeProperty() {
		System.out.println("Home : HomeProperty class default consturcot");
	}

	public boolean isKitchen() {
		return kitchen;
	}

	public boolean isMainDoor() {
		return mainDoor;
	}

}
