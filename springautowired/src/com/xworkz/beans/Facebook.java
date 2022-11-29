package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Facebook {
	@Autowired
	private String facebookUsername;
	@Autowired
	private String facebookPasword;
	@Autowired
	private FacebookFriends frnds;

	public Facebook() {
		System.out.println("Facebook def constructor ");
	}

	public String getFacebookPasword() {
		return facebookPasword;
	}

	public String getFacebookUsername() {
		return facebookUsername;
	}

	public void displayFacebookFriends() {
		System.out.println("Number Of Friends " + frnds.getNoOfFriends());
		System.out.println("Mutual Friends " + frnds.getNoOfMutualFrnds());
	}

}
