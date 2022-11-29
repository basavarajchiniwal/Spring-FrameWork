package com.xworkz.demo;

public class Basavaraj {

	static int s, v;
	static {
		s = 10;
		v = 20;
		System.out.println("static " + " ");

	}

	void sum() {
		s = s + 2;
		v = v - 2;

	}

}

class demo {
	public static void main(String[] args) {
	//Basavaraj d=new Basavaraj();
	Basavaraj b=new Basavaraj();
	Basavaraj.s=5;
	Basavaraj.v=4;
b.sum();
	System.out.println(Basavaraj.s+" "+Basavaraj.v);
		}
}
