package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComputerDTO implements Serializable {
	private String compBrand;
	private String compName;
	private String operatingSystem;
	private int ramCapacity;
	private int hardDiskCapacity;

}
