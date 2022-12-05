package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Name {
	@Value("American Pit Bull")
	private String firstTime;
	
	private String middleName;
	@Autowired
	private String lastName;
	

}
