package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GrocerryOnline {
	@Autowired
	private boolean online;
	@Autowired
	private boolean isSuperMarket;

	public boolean isSuperMarket() {
		return isSuperMarket;
	}

	public boolean isOnline() {
		return online;
	}

}
