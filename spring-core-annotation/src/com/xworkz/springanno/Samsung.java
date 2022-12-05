package com.xworkz.springanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//spring core annotation
@Component
public class Samsung {
@Autowired
@Qualifier("mediatek")
MobileProcessor cpu;
public MobileProcessor getcpu() {
	return cpu;
	
}
public void setCpu(MobileProcessor cpu) {
	this.cpu=cpu;
}
public void config() {
	System.out.println("octa core,8gb RAM,18mp Camera");
	cpu.process();
}
}
