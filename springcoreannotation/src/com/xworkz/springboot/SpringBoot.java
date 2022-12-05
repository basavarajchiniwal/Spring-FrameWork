package com.xworkz.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.Court;
import com.xworkz.beans.Farmer;
import com.xworkz.beans.Hospital;
import com.xworkz.beans.Institute;
import com.xworkz.beans.Temple;
import com.xworkz.springconfig.SpringConfig;

public class SpringBoot {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Court bean = context.getBean(Court.class);
		bean.setNoOfLawyers(45);
		System.out.println(bean);

		Temple temple = context.getBean(Temple.class);

		System.out.println(temple);

		Hospital hos = context.getBean(Hospital.class);
		System.out.println(hos);
		Hospital bean2 = context.getBean(Hospital.class);
		System.err.println("Hospital Example");
		System.out.println("Hospital Name: " + bean2.getName());
		System.out.println("Location :" + bean2.getLocation());
		System.out.println("Rating :" + bean2.getRating());
		System.out.println("Country :" + bean2.getCountry());
		bean2.display();

		Institute institute = context.getBean(Institute.class);
		System.out.println(institute);

		Farmer farm = context.getBean(Farmer.class);
		System.out.println(farm);
	}

}
