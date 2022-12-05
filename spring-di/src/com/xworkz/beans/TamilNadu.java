package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TamilNadu {
	@Value("Tamil nadu")
	private String name;
	
	@Value("4.5 crore")
	private String population;
	
	@Value("Chennai")
	private String capitalCity;
	
	@Value("24")
	private int noOfDistricts;
	
	@Value("1,61,280 sq.Km")
	private String area;
	
	@Value("Anna Pillai")
	private String cmName;
	
	@Value("Tamil")
	private String primaryLanguage;
	
	

	@Override
	public String toString() {
		return "TamilNadu [name=" + name + ", population=" + population + ", capitalCity=" + capitalCity
				+ ", noOfDistricts=" + noOfDistricts + ", area=" + area + ", cmName=" + cmName + ", primaryLanguage="
				+ primaryLanguage + "]";
	}
	
}
