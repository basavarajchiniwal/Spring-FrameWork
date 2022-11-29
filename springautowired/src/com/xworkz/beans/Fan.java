package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fan {
	@Autowired
	private String fanType;
	@Autowired
	private String fanBrand;
	@Autowired
	private FanPlates plates;

	public Fan() {
		System.out.println("def constructor");
	}

	public String getFanBrand() {
		return fanBrand;
	}

	public String getFanType() {
		return fanType;
	}

	public void displayFanPlates() {
		System.out.println("type of fan plates" + plates.getFanPlatesType());
	}
}
