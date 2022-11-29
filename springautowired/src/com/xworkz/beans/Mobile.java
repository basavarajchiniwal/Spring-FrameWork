package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	private String mobileBrand;
	@Autowired
	private double mobilePrice;
	@Autowired
	private MobileAutowired mbl;

	public Mobile() {
		System.out.println("mobile running default constructor");
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public double getMobilePrice() {
		return mobilePrice;
	}

	public void displayMobileAutowired() {
		System.out.println("Is Mobile has RAM " + mbl.isRam());
		System.out.println("Is Mobile Has Processor " + mbl.isProcessor());
		System.out.println("Is mobile has secondary Memory " + mbl.isSecMemory());
	}

}
