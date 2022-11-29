package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	@Autowired
	private Boolean computerType;
	@Autowired
	private String computerBrand;
	@Autowired
	private ComputerCpu cpu;

	public Computer() {
		System.out.println("Def Constructor");
	}

	public String getComputerBrand() {
		return computerBrand;
	}

	public Boolean getComputerType() {
		return computerType;
	}

	public void displayComputerCpu() {
		System.out.println("CPU Brand "+cpu.getCpuBrand());
		System.out.println("CPU Processor "+cpu.getCpuProcessorType());
	}

}
