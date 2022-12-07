package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WhatsappDTO implements Serializable {
	private String owner;
	private String userName;
	private double noOfUsers;
	private int noOfContacts;

}
