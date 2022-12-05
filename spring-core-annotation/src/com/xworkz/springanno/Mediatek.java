package com.xworkz.springanno;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class Mediatek implements MobileProcessor {
public void process() {
	System.out.println("its mediaTek Processor");
}
}
