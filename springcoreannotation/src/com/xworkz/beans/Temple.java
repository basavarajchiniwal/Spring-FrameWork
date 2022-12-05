package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Temple {
	private String name;
	private String place;
	@Value("10.30AM")
	private String openTime;
	@Autowired
	private Priest priest;

	public Temple(String name) {

		System.out.println("created tmple parameterized constructor");
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Temple name=" + name + "\n Temple place=" + place + "\n Temple openTime=" + openTime
				+ "\n Temple priest=" + priest;
	}
}
