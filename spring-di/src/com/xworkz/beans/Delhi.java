package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Delhi {
	@Value("Delhi")
	private String name;
	@Value("2.5")
	private double area;
	@Value("Vinay Kumar Saxena")
	private String governorName;
	@Value("20.6")
	private double populationInMillion;
	
	
	@Override
	public String toString() {
		return "Delhi [name=" + name + ", area=" + area + ", governorName=" + governorName + ", populationInMillion="
				+ populationInMillion + "]";
	}
}
