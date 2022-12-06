package com.xworkz.abstraction.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimDTO implements Serializable {
	private int id;
	private String type;
	private String operator;
	private long imei;
}
