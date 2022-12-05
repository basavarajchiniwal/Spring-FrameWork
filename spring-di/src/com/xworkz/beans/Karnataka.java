package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Karnataka {
	@Value("karnataka")
	private String name;

	@Value("7.5 crore")
	private String population;
	
	@Value("Bangalore")
	private String capitalCity;
	
	@Value("28")
	private int noOfDistricts;
	
	@Value("1,91,791 sq.Km")
	private String area;
	
	@Value("Basavaraj bommai")
	private String cmName;
	
	@Value("Kannada")
	private String primaryLanguage;
	

	@Override
	public String toString() {
		return "Karnataka [name=" + name + ", population=" + population + ", capitalCity=" + capitalCity
				+ ", noOfDistricts=" + noOfDistricts + ", area=" + area + ", cmName=" + cmName + ", primaryLanguage="
				+ primaryLanguage + "]";
	}
	
}
