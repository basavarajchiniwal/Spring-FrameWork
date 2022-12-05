package com.xworkz.springconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.bean.Gym;

@Configuration
public class SpringConfiguration {
	ApplicationContext spring=new AnnotationConfigApplicationContext(Gym.class);
	

}
