package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleEngine {
	@Autowired
private String engineName;
	@Autowired
private String engineType;
	public VehicleEngine() {
System.out.println("Vehicle: VehicleEngine Def Contructor");
}
	public String getEngineName() {
		return engineName;
	}
	public String getEngineType() {
		return engineType;
	}

}
