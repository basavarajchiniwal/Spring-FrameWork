package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrimeMinister {
	@Autowired
	@Qualifier("pmName")
	private Name name;
	@Value("55")
	private int age;
	@Value("8 th pass ")
	private String expertise;
	@Value("BJP")
	private String partyName;
	@Value("2")
	private int noOfTimesElected;
	@Autowired
	@Qualifier("pmSalary")
	private Salary salary;
	@Autowired
	@Qualifier("pmEducation")
	private Education education;
	
	
	public PrimeMinister() {
	}


	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + ", expertise=" + expertise + ", partyName=" + partyName
				+ ", noOfTimesElected=" + noOfTimesElected + ", salary=" + salary + ", education=" + education + "]";
	}
	
	
}
