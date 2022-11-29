package com.xworkz.demo;

abstract class Test {
	abstract public void m1();

	abstract void m2();

}

abstract class SubTest extends Test {
	public void m1() {
		System.out.println("running m1 method");
	} 	
}

class SubSubTest extends Test {

	public void m2() {
		System.out.println("running m2 method");
	}
}
