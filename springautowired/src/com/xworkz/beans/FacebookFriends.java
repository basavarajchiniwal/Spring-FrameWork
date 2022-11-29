package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FacebookFriends {
	@Autowired
	private int noOfFriends;
	@Autowired
	private int noOfMutualFrnds;

	public FacebookFriends() {
		System.out.println("FacebookFriends: Def Contructor");
	}

	public int getNoOfFriends() {
		return noOfFriends;
	}

	public int getNoOfMutualFrnds() {
		return noOfMutualFrnds;
	}

}
