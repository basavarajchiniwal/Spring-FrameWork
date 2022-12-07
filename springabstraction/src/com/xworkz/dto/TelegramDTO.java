package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TelegramDTO implements Serializable{
	private String userName;
	private int noOfContacts;
	private String owner;
	

}
