package com.xworkz.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmDTO implements Serializable {
	private String directorName;
	private int noOfLeadRole;
	private boolean climax;
	private String heroName;
	private String actressName;
	private String villainName;
	private String sensorCertificate;

}
