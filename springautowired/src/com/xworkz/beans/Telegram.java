package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Telegram {
	@Autowired
	private String userName;
	@Autowired
	private String password;
	@Autowired
	TelegramAutowired tel;

	public Telegram() {
		System.out.println("Telegram Default Contructor ");
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void displayTelegramAutowired() {
		System.out.println("Number Of Groups " + tel.getNoOfGroups());
		System.out.println("Number Of Contacts " + tel.getNoOfContacts());
	}

}
