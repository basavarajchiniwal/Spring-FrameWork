package com.xworkz.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.Country;
import com.xworkz.beans.President;
import com.xworkz.beans.PrimeMinister;
import com.xworkz.beans.VicePresident;
import com.xworkz.springconfig.SpringConfiguration;

public class SpringBoot {
	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Country ct1 = spring.getBean(Country.class);
		System.out.println(ct1);

		PrimeMinister nm1 = spring.getBean(PrimeMinister.class);
		System.out.println(nm1);

		President pre = spring.getBean(President.class);
		System.out.println(pre);

		VicePresident nm3 = spring.getBean(VicePresident.class);
		System.out.println(nm3);

	}

}
