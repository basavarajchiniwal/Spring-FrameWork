package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VicePresident {
	@Autowired
	@Qualifier("vicePresidentName")
	private Name name;
	@Value("65")
	private int age;
	@Value("Masters in Political Science ")
	private String expertise;
	@Autowired
	@Qualifier("vicePresidentSalary")
	private Salary salary;
	@Autowired
	@Qualifier("vicePresidentEducation")
	private Education education;
	
	
	@Override
	public String toString() {
		return "VicePresident [name=" + name + ", age=" + age + ", expertise=" + expertise + ", salary=" + salary
				+ ", education=" + education + "]";
	}
}
