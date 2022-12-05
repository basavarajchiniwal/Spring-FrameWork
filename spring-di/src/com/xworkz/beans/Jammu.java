package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Jammu {
	@Value("Jammu")
	private String name;
	@Value("5.8")
	private double area;
	@Value("G H Patil")
	private String governorName;
	@Value("6.9")
	private double populationInMillion;
	
	
	@Override
	public String toString() {
		return "Jammu [name=" + name + ", area=" + area + ", governorName=" + governorName + ", populationInMillion="
				+ populationInMillion + "]";
	}
	
}
