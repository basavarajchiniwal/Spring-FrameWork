package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	@Autowired
private boolean barCounter;
	@Autowired
private String service;
	@Autowired
	private BarBottleAutowired bottle;
	public Bar() {
System.out.println("Bar Default Contructor");
}
	public String getService() {
		return service;
	}
	public boolean isbarCounter() {
		return barCounter;
	}
	public void dispayBarBottleAutowired() {
		System.out.println("Bootle Type :"+bottle.getbottleType());
		System.out.println("Bottle Size : "+bottle.getBottleSize());
	}
}
