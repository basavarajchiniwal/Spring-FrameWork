package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Gujarath {
	@Value("Gujarat")
	private String name;
	
	@Value("5.5 crore")
	private String population;
	
	@Value("Gandhinagar")
	private String capitalCity;
	
	@Value("20")
	private int noOfDistricts;
	
	@Value("1,45,441 sq.Km")
	private String area;
	
	@Value("Varsha Patel")
	private String cmName;
	
	@Value("Gujarati")
	private String primaryLanguage;

	@Override
	public String toString() {
		return "Gujarat [name=" + name + ", population=" + population + ", capitalCity=" + capitalCity
				+ ", noOfDistricts=" + noOfDistricts + ", area=" + area + ", cmName=" + cmName + ", primaryLanguage="
				+ primaryLanguage + "]";
	}
}
