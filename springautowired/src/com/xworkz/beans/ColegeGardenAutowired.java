package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ColegeGardenAutowired {
	@Autowired
	private int noOfTree;

	public int  getNoOfTree() {
		return noOfTree;
	}
	
}
