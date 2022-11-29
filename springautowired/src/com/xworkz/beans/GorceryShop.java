package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GorceryShop {
	@Autowired
	private GrocerryOnline onlineExist;
	@Autowired
	private String groceryShopName;
	@Autowired
	private String grceryShopAddress;

	public String getGrceryShopAddress() {
		return grceryShopAddress;
	}

	public String getGroceryShopName() {
		return groceryShopName;
	}

	public void displayGrocerryOnline() {
		System.out.println("Is this SuperMarket " + onlineExist.isSuperMarket());
		System.out.println("Online Available " + onlineExist.isOnline());
	}

}
