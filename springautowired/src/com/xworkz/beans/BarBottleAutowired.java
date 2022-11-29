package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BarBottleAutowired {
	@Autowired
	private String bottleType;
	@Autowired
	private String bottleSize;

	public BarBottleAutowired() {
		System.out.println("BarBottleAutowired def contructor");
	}

	public String getBottleSize() {
		return bottleSize;
	}

	public String getbottleType() {
		return bottleType;
	}

}
