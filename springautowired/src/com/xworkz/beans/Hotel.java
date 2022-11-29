package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hotel {
	@Autowired
	private String hotelName;
	@Autowired
	private String type;
	@Autowired
	private HotelAutowired hotel;

	public Hotel() {
		System.out.println("Hotel Default Constructor");
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getType() {
		return type;
	}
	public void displayHotelAutwired() {
		System.out.println("Is Hotel Having Menu Card "+hotel.getMenuCard());
		System.out.println("Is Hotel Having Counter "+hotel.getCounter());
	}
}
