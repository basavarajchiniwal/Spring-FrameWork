package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WhatsAppStatus {
	@Autowired
	private String statusPerson;
	@Autowired
	private int noOfStatus;

	public WhatsAppStatus() {
		System.out.println("WhatsApp: WhatsAppStatus class Default Contructor");
	}

	public int getnoOfStatus() {
		return noOfStatus;
	}

	public String getStatusPerson() {
		return statusPerson;
	}
}
