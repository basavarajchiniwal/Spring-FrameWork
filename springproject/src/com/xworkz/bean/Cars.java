package com.xworkz.bean;

import org.springframework.stereotype.Component;

@Component
public class Cars {
	public Cars() {
		System.out.println("running defult constr");
	}

	public void transport() {
		System.out.println("running transport method");
	}
}
