package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Priest {
	private String name;
	private int age;
	private int salary;
	@Autowired
	//@Qualifier("priestPoojaTime")
	private String priestPoojaTime;
	@Autowired
	//@Qualifier("religion")
	private String priestReligion;

	public Priest(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		System.out.println("\nTemple Example");
		return "Priest name=" + name + "\n Priest age=" + age + "\n Priest salary=" + salary + "\n Temple poojaTime=" + priestPoojaTime + "\n Priest religion="
				+ priestReligion ;
	}

}
