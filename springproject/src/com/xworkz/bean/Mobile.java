package com.xworkz.bean;

import org.springframework.stereotype.Component;

@Component
public class Mobile {
	public Mobile() {
		System.out.println("defult constr");
	}

	public void call() {
		System.out.println("running call method");
	}
}
