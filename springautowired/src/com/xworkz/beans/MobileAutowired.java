package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MobileAutowired {
	@Autowired
	private boolean ram;
	@Autowired
	private boolean processor;
	@Autowired
	private boolean secMemory;

	public MobileAutowired() {
		System.out.println("running inside MobileAutowired def constructor");
	}
	public boolean isRam() {
		return ram;
	}
	public boolean isProcessor() {
		return processor;
	}
	public boolean isSecMemory() {
		return secMemory;
	}
}
