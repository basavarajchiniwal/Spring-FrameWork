package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanPlates {
	@Autowired
	private String fanPlatesType;

	public FanPlates() {
		System.out.println("def constructor");
	}

	public String getFanPlatesType() {
		return fanPlatesType;
	}

}
