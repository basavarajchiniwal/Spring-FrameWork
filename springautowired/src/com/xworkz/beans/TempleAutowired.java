package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TempleAutowired {
	@Autowired
	private boolean donationCounter;
	@Autowired
	private String godName;

	public TempleAutowired() {
		System.out.println("TempleAutowired default Contructor ");
	}

	public String getGodName() {
		return godName;
	}

	public boolean isDonationCounter() {
		return donationCounter;
	}
}
