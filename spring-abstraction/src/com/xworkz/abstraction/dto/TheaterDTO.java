package com.xworkz.abstraction.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TheaterDTO implements Serializable {
	private String place;
	private int charges;
	private int noOfSeats;
	private String theaterName;
	private int startYear;
}
