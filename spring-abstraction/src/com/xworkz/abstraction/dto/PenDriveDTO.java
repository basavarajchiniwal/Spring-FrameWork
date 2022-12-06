package com.xworkz.abstraction.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PenDriveDTO implements Serializable {
	private float capacity;
	private double price;
	private String brand;

}
