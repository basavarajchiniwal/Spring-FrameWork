package com.xworkz.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.beans.Ambulance;
import com.xworkz.beans.Court;
import com.xworkz.beans.Founder;
import com.xworkz.beans.Hospital;
import com.xworkz.beans.Institute;
import com.xworkz.beans.Judge;
import com.xworkz.beans.Priest;
import com.xworkz.beans.Temple;

@Configuration
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfig {
	@Bean
	public Court court() {
		Court crt = new Court("civil court1");
		return crt;
	}// @Value("civil court") or @Bean

//	@Bean
//	public Judge judge() {
//		Judge judge = new Judge("SundarLal", 58);
//		judge.setEducation("law");
//		return judge;
//	}

	@Bean
	public int judgeExperience() {
		return 40;
	}

	@Bean
	public String judgeGender() {
		return "male";
	}

	// temple
	@Bean
	public Temple temple() {
		Temple temp = new Temple("Omkareshwar Temple");
		temp.setPlace("gadag");
		return temp;
	}

	@Bean
	public Priest priest() {
		Priest pre = new Priest("Manoj", 30);
		pre.setSalary(15500);
		return pre;
	}

	@Bean
	public String priestPoojaTime() {
		return "9.00AM";
	}

	@Bean
	public String priestReligion() {
		return "Hindu";
	}

	// Hospital

	@Bean
	public Hospital hospital() {
		Hospital hospital = new Hospital("jayadeva", 4.5);
		return hospital;
	}

	@Bean
	public String hospitalCountry() {
		return "India";
	}

	@Bean
	public double rating() {
		return 4.9;
	}

	@Bean
	public String hospitalLocation() {
		return "BTM Layout";
	}

	// institute example
	@Bean
	public Institute institute() {
		Institute inst = new Institute("X-workz(ODC)");
		inst.setNoOfFaculties(15);
		inst.getClass().getSimpleName();
		return inst;
	}

//	@Bean // .java or .class
//	public Founder founder() {
//		Founder f = new Founder("Omkar Sir", 35);
//		f.setPlace("b'lore");
//		return f;
//	}

	@Bean
	public String founderPlace() {
		return "BTM LAYOUT";
	}
	@Bean
	public String education() {
		return "Bachelor Degree";
	}
	
//	@Bean
//	public int founderExperience() {
//		return 10;
//	}
	

}
