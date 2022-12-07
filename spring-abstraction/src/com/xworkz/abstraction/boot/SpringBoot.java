package com.xworkz.abstraction.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.abstraction.service.AtmService;
import com.xworkz.abstraction.service.AtmServiceImpl;
import com.xworkz.abstraction.service.PenDriveService;
import com.xworkz.abstraction.service.RoboService;
import com.xworkz.abstraction.service.SimService;
import com.xworkz.abstraction.service.TheaterService;
import com.xworkz.abstractoin.beans.SpringConfiguration;

public class SpringBoot {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		AtmService atm = context.getBean(AtmService.class);
		System.out.println(atm.validateAndSave(null));
		System.out.println("=====2nd example=====");
		PenDriveService bean = context.getBean(PenDriveService.class);
		boolean save = bean.validateAndSave(null);
		System.out.println(save);
		System.out.println("=====3rd example=====");
		RoboService bean2 = context.getBean(RoboService.class);
		System.out.println(bean2.validateAndSave(null));
		System.out.println("=====4th example=====");
		SimService bean3 = context.getBean(SimService.class);
		System.out.println(bean3.validateAndSave(null));
		System.out.println("=====5th example=====");
		TheaterService bean4 = context.getBean(TheaterService.class);
		System.out.println(bean4.validateAndSave(null));
	}

}
