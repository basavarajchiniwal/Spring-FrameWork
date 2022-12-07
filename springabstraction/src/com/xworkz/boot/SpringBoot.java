package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beans.SpringConfig;
import com.xworkz.dto.CarDTO;
import com.xworkz.repository.FilmRepository;
import com.xworkz.service.BoatService;
import com.xworkz.service.BusService;
import com.xworkz.service.CarService;
import com.xworkz.service.CompanyService;
import com.xworkz.service.FilmService;
import com.xworkz.service.PgService;
import com.xworkz.service.RestaurentService;
import com.xworkz.service.TelegramService;
import com.xworkz.service.WhatsappService;

public class SpringBoot {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		BoatService bean = context.getBean(BoatService.class);
		bean.validateAndSave(null);
		System.out.println("=====2nd example=====");
		BusService bean2 = context.getBean(BusService.class);
		bean2.validateAndSave(null);
		System.out.println("=====3rd=====");
		CarService bean3 = context.getBean(CarService.class);
		boolean save = bean3.validateAndSave(null);
		System.out.println(save);
		System.out.println("=====4th example=====");
		CompanyService bean4 = context.getBean(CompanyService.class);
		boolean save2 = bean4.validateAndSave(null);
		System.out.println(save2);
		System.out.println("=====5th example=====");
		FilmService bean5 = context.getBean(FilmService.class);
		boolean validateAndSave = bean5.validateAndSave(null);
		System.out.println(validateAndSave);
		System.out.println("=====6th example=====");
		PgService bean6 = context.getBean(PgService.class);
		System.out.println(bean6.validateAndSvae(null));
		System.out.println("=====7th example=====");
		RestaurentService bean7 = context.getBean(RestaurentService.class);
		System.out.println(bean7.validateAndSave(null));
		System.out.println("=====8th example=====");
		TelegramService bean8 = context.getBean(TelegramService.class);
		System.out.println(bean8.validateAndSave(null));
		System.out.println("=====9th example=====");
		WhatsappService bean9 = context.getBean(WhatsappService.class);
		System.out.println(bean9.validateAndSave(null));
		System.out.println("=====10th example=====");
		CompanyService bean10 = context.getBean(CompanyService.class);
		System.out.println(bean10.validateAndSave(null));
	}

}
