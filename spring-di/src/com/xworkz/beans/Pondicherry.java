package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pondicherry {
	@Value("Pondicherry")
	private String name;
	@Value("2.5")
	private double area;
	@Value("Kiran Bedi")
	private String governorName;
	@Value("1.2")
	private double populationInMillion;
	
	
	@Override
	public String toString() {
		return "Pondicherry [name=" + name + ", area=" + area + ", governorName=" + governorName
				+ ", populationInMillion=" + populationInMillion + "]";
	}
}
