package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelAutowired {
	@Autowired
	private boolean menuCard;
	@Autowired
	private boolean counter;

	@Autowired
	public HotelAutowired() {
		System.out.println("Hotel: HotelAutowired default contructor");
	}

	public boolean getMenuCard() {
		return menuCard;

	}

	public boolean getCounter() {
		return counter;
	}
	
}
