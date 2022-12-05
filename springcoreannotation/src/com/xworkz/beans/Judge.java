package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Judge {
	private String name;
	private int age;
	private String education;
	@Autowired
	@Qualifier("judgeExperience") 
	private int experience;
	@Autowired // fetch value from spring and shows in main class
	@Qualifier("judgeGender")
	private String gender;

	public Judge(@Value("SundarLal") String name, @Value("25") int age) {
		System.out.println("created parameterized contructor");
		this.name = name;
		this.age = age;
	}
	@Value("gfhf")
	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public String toString() {

		return "Judge name=" + name + "\n Judge age=" + age + "\n Judge education=" + education + "\n Judge experience="
				+ experience + "\n Judge gender=" + gender;
	}

}
