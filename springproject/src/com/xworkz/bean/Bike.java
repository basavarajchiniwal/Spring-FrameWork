package com.xworkz.bean;

import org.springframework.stereotype.Component;

@Component
public class Bike {
	public Bike() {
		System.out.println("running defult constr");
	}

	public void transport() {
		System.out.println("running transport method");
	}
}
