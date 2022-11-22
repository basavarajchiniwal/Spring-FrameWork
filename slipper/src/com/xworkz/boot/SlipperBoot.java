package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.entity.SlipperEntity;

public class SlipperBoot {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext();
		SlipperEntity entity = context.getBean(SlipperEntity.class);
		entity.protection();
	}

}
