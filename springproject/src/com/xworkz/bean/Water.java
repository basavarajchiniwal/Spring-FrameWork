package com.xworkz.bean;

import org.springframework.stereotype.Component;

@Component
public class Water {
	public Water() {
		System.out.println("default constructor");
	}

	public void taste() {
		System.out.println("Water has no taste and color");
	}
}
