package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WhatsApp {
	@Autowired
	private String userName;
	@Autowired
	private int noOfContacts;
	@Autowired
	private WhatsAppStatus status;

	public WhatsApp() {
		System.out.println("Whatsapp default contructor");
	}

	public int getNoOfContacts() {
		return noOfContacts;
	}

	public String getUserName() {
		return userName;
	}

	public void displayWhatsAppStatus() {
		System.out.println("WhatsApp: Status existed Person Name " + status.getStatusPerson());
		System.out.println("Whatsapp: number of status are " + status.getnoOfStatus());
	}

}
