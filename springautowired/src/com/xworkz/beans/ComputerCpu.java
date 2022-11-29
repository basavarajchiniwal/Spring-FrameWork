package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComputerCpu {
	@Autowired
	private String cpuBrand;
	@Autowired
	private String cpuProcessorType;

	public ComputerCpu() {
		System.out.println("ComputerCpu def contructor");
	}

	public String getCpuBrand() {
		return cpuBrand;
	}

	public String getCpuProcessorType() {
		return cpuProcessorType;
	}

}
