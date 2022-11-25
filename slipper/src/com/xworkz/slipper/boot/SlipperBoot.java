package com.xworkz.slipper.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.slipper.beans.SlipperEntity;
import com.xworkz.slipper.configuration.SpringConfiguration;

public class SlipperBoot {

	public static void main(String[] args) {
		// JewellaeryDao dao=new JewellaryDaoImpl();
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		SlipperEntity refOfSlipper = spring.getBean(SlipperEntity.class);
		refOfSlipper.protection();
	}

}
