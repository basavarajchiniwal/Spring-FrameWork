package com.xworkz.abstraction.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoboDTO implements Serializable {
	private String type;
	private String function;
	private String roboName;
	private String roboVersion;

}
