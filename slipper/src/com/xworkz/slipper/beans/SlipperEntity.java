package com.xworkz.slipper.beans;

import org.springframework.stereotype.Component;

@Component
public class SlipperEntity {
	public SlipperEntity() {
		System.out.println("Slipper Entity default constructor");
	}

	public void protection() {
		System.out.println("slipper provides protection to feet");
	}
}
