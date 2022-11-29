package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketTeamCaptain {
	@Autowired
	private String captainName;
	@Autowired
	private int captainAge;

	public String getCaptainName() {
		return captainName;
	}

	public int getCaptainAge() {
		return captainAge;
	}
}
