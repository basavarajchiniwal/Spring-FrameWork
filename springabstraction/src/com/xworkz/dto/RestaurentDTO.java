package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurentDTO implements Serializable {
	private String name;
	private String place;
	private int noOfRoomsBooked;
	private boolean onlineAvailable;
	
	

}
