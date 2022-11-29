package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlowersSmell {
	@Autowired
	private boolean smell;

	public FlowersSmell() {
		System.out.println("FlowersSmell def contructor");
	}

	public boolean isSmell() {
		return smell;
	}

}
