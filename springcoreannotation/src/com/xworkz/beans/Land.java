package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Land {
	private String place;
	private double totalAcre;
	private String landType;
	private String landOwner;
	@Autowired
	private Farmer farmer;
	@Autowired
	private BoreWell borewell;

	public Land(@Value("Gadag") String place, @Value("2.5 Acre") double totalAcre) {
		this.place = place;
		this.totalAcre = totalAcre;
	}

	public void setType(@Value("Arable Land") String type) {
		this.landType = type;
	}

	public void setLandOwner(@Value("Sachin") String landOwner) {
		this.landOwner = landOwner;
	}

	@Override
	public String toString() {
		return "Land place=" + place + "\n totalAcre=" + totalAcre + "\n Land type=" + landType + "\n Land Owner="
				+ landOwner;
	}

}
