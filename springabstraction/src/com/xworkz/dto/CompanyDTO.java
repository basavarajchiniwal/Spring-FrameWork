package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDTO implements Serializable{
	private String name;
	private String owner;
	private String companyCeoName;
	private double annualTurnOver;
	private int noOfEmployees;
	

}
