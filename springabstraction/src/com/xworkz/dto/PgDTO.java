package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PgDTO implements Serializable {
	private String pgName;
	private String pgOwnerName;
	private int monthlyIncome;
	private double ownerContactNumber;
	private String pgAddress;
	private int noOfpersons;

}
