package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Institute {
	private String name;
	@Value("BTM Layout")
	private String place;
	private int noOfFaculties;
	@Autowired // fetch value from spring
	private Founder founder;

	public Institute(String instName) {
		this.name = instName;
	}

	public void setNoOfFaculties(int noOfFaculties) { //setter injection
		this.noOfFaculties = noOfFaculties;
	}

	@Override
	public String toString() {
		return "Institute name=" + name + "\nInstitute place=" + place + "\nNumber of Faculties=" + noOfFaculties + "\n Institute founder="
				+ founder;
	}

}
