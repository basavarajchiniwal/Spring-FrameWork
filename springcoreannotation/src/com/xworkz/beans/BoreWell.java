package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BoreWell {
	@Value("Gadag")
	private String place;
	@Value("true")
	private boolean waterAvailable;
	@Value("1700 feet")
	private String depth;

}
