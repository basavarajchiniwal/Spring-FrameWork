package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoatDTO implements Serializable {
	private String boatBrand;
	private String name;
	private int passengerCarries;
	private boolean swimmingPool;

}
