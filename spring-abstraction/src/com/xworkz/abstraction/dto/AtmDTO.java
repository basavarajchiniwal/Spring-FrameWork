package com.xworkz.abstraction.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AtmDTO implements Serializable {
	private String withdraw;
	private int noOfButtons;
	private int atmPin;
	private boolean depositAvailable;

}
