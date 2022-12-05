package com.xworkz.beans;

import org.springframework.stereotype.Component;

@Component
public class Education {
	private String id;
	private String university;
	private String branch;
	private int passOutYear;
	private String place;
	private int backlogs;
	private double percentage;
	private boolean passed;
	
	
	public Education() {
	}


	public Education(String id, String university, String branch, int passOutYear, String place, int backlogs,
			double percentage, boolean passed) {
		super();
		this.id = id;
		this.university = university;
		this.branch = branch;
		this.passOutYear = passOutYear;
		this.place = place;
		this.backlogs = backlogs;
		this.percentage = percentage;
		this.passed = passed;
	}


	@Override
	public String toString() {
		return "Education [id=" + id + ", university=" + university + ", branch=" + branch + ", passOutYear="
				+ passOutYear + ", place=" + place + ", backlogs=" + backlogs + ", percentage=" + percentage
				+ ", passed=" + passed + "]";
	}
}
