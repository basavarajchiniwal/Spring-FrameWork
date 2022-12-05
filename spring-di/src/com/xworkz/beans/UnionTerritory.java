package com.xworkz.beans;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UnionTerritory {
	@Value("Jammu"+" Ladakh"+" Pondicherry"+" Delhi")
	private String [] utNames;
	@Autowired
	private Jammu jammu;
	@Autowired
	private Ladakh ladakh;
	@Autowired
	private Pondicherry pondicherry;
	@Autowired
	private Delhi delhi;
	
	
	@Override
	public String toString() {
		return "UnionTerritory [utNames=" + Arrays.toString(utNames) + ", jammu=" + jammu + ", ladakh=" + ladakh
				+ ", pondicherry=" + pondicherry + ", delhi=" + delhi + "]";
	}
}
