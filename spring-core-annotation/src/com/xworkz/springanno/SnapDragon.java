package com.xworkz.springanno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //1st option or you can go with qualifier annotation
public class SnapDragon implements MobileProcessor {
	public void process() {
		System.out.println("SnapDragon is the world best cpu");
	}

}
