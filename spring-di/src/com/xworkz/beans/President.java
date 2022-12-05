package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class President {
	@Autowired
	@Qualifier("presidentName")
	private Name name;
	@Value("62")
	private int age;
	@Value("B.E in Electrical ")
	private String expertise;
	@Autowired
	@Qualifier("presidentSalary")
	private Salary salary;
	@Autowired
	@Qualifier("presidentEducation")
	private Education education;
	
	
	
	
	public President() {
		System.out.println(getClass().getSimpleName());
	}


	@Override
	public String toString() {
		return "President [name=" + name + ", age=" + age + ", expertise=" + expertise + ", salary=" + salary
				+ ", education=" + education + "]";
	}

	
	

}
