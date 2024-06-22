package org.lessons.java.inheritance.shop;

public class Cuffie extends Prodotto {
	// instance variables
	String colour;
	boolean isWireless;
	// constructor method
	public Cuffie(String name, String brand, double price, int vat, String colour, boolean isWireless) {
		super(name, brand, price, vat);
		this.colour = colour;
		this.isWireless = isWireless;
	}
	// Getters and Setters
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isWireless() {
		return isWireless;
	}
	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	

}
