package com.xworkz.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Gym {
	@Value("BTM Layout")
	private String name;
	//private boolean certificate;
	@Autowired
	private Trainer trainer; //autowired 
	private double rent;//@autowired or @value
	@Autowired
	private String place;
	
	
	

}
