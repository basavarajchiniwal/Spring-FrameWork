package com.xworkz.entities;

public class Films {
	private String filmName;

	public Films() {
		System.out.println("You Enatered into Default constructor");
	}

	public String filmName() {
		this.filmName = filmName;
		return filmName;
	}

	public void filmHero() {
		System.out.println("Rishabh Shetty");
	}

	public void filmBudget() {
		System.out.println("40  crores Investement");
	}

	public Boolean filmClimax() {
		System.out.println("Happy Ending");
		return true;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public String getFilmName() {
		return filmName;
	}

	@Override
	public String toString() {
		this.filmName = filmName;
		return filmName;
	}
}
