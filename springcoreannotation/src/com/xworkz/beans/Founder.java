package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Founder {
	private String name;
	private int age;
	// @Qualifier("founderPlace")
	private String place;
	@Autowired
	private String education;
	@Autowired
	@Qualifier("founderExperience")
	private int experience;

	public Founder(String name, int age) {
		System.out.println("parametrized contructor");
		this.name = name;
		this.age = age;
	}
	@Value("bangalore")
	public void setPlace(String place) { // setter injection
		this.place = place;

	}

	@Override
	public String toString() {
		return "founder Name=" + name + "\n founder age=" + age + "\nfounder place=" + place + "\nfounder Education="
				+ education + "\nfounder experience=" + experience;
	}
}
/*
 * the process of referring of an object into a class is called as dependency
 * injection setter injection-->using setter methods constructor injection-->
 * using contructor
 */
