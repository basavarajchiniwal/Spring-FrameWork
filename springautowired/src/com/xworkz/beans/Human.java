package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
@Autowired
private String commumity;
@Autowired
private String emotions;
@Autowired
private HumanNature nature;
public Human() {
System.out.println("def contructor");
}
public String getCommumity() {
	return commumity;
}
public String getEmotions() {
	return emotions;
}
public void displayHumanNature() {
	System.out.println("Type Of Nature "+nature.getNatureType());
}
}
