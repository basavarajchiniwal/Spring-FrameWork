package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeautyParlour {
	@Autowired
	private String parlourName;
	@Autowired
	private String parloueOwnerName;
	@Autowired
	private beautyParlourAutowiredAc beauty;

	public BeautyParlour() {
		System.out.println("BeautyParlour Default Contructor");
	}

	public String getParloueOwnerName() {
		return parloueOwnerName;
	}

	public String getParlourName() {
		return parlourName;
	}

	public void displayBeautyParlourAutowiredAc() {
		System.out.println("AC brand Name " + beauty.getAcBrandName());
		System.out.println("AC production place  " + beauty.getAcProdPlace());
	}
}
