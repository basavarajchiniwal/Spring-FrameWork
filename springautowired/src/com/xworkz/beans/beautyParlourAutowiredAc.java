package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class beautyParlourAutowiredAc {
	@Autowired
	private String acBrandName;
	@Autowired
	private String acProdPlace;

	public beautyParlourAutowiredAc() {
		System.out.println("BeautyParlour: AC Default Contructor");
	}

	public String getAcBrandName() {
		return acBrandName;
	}

	public String getAcProdPlace() {
		return acProdPlace;
	}

}
