package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StatesBengaloreAutowired {
	@Autowired
	private String originalName;
	@Autowired
	private String bengaloreIs;
	
	
	public String getOriginalName() {
		return originalName;
	}
	public String getBengaloreIs() {
		return bengaloreIs;
	}
}
