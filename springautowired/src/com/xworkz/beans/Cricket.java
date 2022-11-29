package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cricket {
	@Autowired
	private String teamName;
	@Autowired
	private int noOfPlayers;
	@Autowired
	private CricketTeamCaptain teamCaptain;

	public String getTeamName() {
		return teamName;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void displayCricketTeamCaptain() {
		System.out.println("Team Captain Name is " + teamCaptain.getCaptainName());
		System.out.println("Team Captain Age is " + teamCaptain.getCaptainAge());
	}
}
