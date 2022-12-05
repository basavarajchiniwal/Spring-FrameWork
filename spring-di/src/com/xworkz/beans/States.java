package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class States {
	@Autowired
	private Karnataka karnataka;
	@Autowired
	private AndraPradesh andrapradesh;
	@Autowired
	private TamilNadu tn;
	@Autowired
	private Maharastra mh;
	@Autowired
	private Gujarath gj;
	
	
	
	@Override
	public String toString() {
		return "States [karnataka=" + karnataka + ", andrapradesh=" + andrapradesh + ", tn=" + tn + ", mh=" + mh
				+ ", gj=" + gj + "]";
	}
}
