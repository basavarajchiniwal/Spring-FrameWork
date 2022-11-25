package com.xworkz.bean;

public class BrownBread {
	private String bakeryName;

	public BrownBread() {
		System.out.println("default constructor");
	}

	
	public void toast() {
System.out.println("running toast in bread");
}

	public void setBakeryName(String bakeryName) {
		this.bakeryName=bakeryName;
	}
	public String getBakeryName() {
		return bakeryName;
	}

}
