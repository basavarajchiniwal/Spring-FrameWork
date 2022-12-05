package com.xworkz.slipper.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.slipper.beans.SlipperEntity;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {
	public SpringConfiguration() {
		System.out.println("default constructor of SpringConfiguration class");
	}
//	@Bean
//	public SlipperEntity slipperEntity() {
//		SlipperEntity entity = new SlipperEntity();
//		return entity;
//	}
	

}
