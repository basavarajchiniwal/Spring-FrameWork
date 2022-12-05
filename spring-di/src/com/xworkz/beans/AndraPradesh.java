package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AndraPradesh {
	@Value("Andra Pradesh")
	private String name;

	@Value("5.5 crore")
	private String population;
	
	@Value("Vijayawada")
	private String capitalCity;
	
	@Value("22")
	private int noOfDistricts;
	
	@Value("1,51,250 sq.Km")
	private String area;
	
	@Value("Jagan Mohan Reddy")
	private String cmName;
	
	@Value("Telugu")
	private String primaryLanguage;
	
	

	@Override
	public String toString() {
		return "AndraPradesh [name=" + name + ", population=" + population + ", capitalCity=" + capitalCity
				+ ", noOfDistricts=" + noOfDistricts + ", area=" + area + ", cmName=" + cmName + ", primaryLanguage="
				+ primaryLanguage + "]";
	}
	
	

}
