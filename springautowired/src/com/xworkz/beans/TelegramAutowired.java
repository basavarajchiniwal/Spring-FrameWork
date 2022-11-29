package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TelegramAutowired {
	@Autowired
	private Integer noOfGroups;
	@Autowired
	private Integer noOfContacts;
	
	public TelegramAutowired() {
System.out.println("Telegram: TelegramAutowired Default Contructor ");
}
	public Integer getNoOfGroups() {
		return noOfGroups;
	}
	public Integer getNoOfContacts() {
		return noOfContacts;
	}
	
}
