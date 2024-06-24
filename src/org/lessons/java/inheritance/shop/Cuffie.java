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
	//constructor Overload
			public Cuffie(String name, String brand, String price, String vat, String colour, String isWireless) {
				super(name, brand, price, vat);
				this.colour = colour;
				if (isWireless.equals("si")) {
					this.isWireless = true;
				}
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
	// earPhonesType
	public String earPhonesType() {
		if (isWireless) {
			return "wireless";
		}
		return "cablate";
	}
	// Override toString method
	@Override
	public String toString() {
		return "Cuffie: " + getFullName() + ", " + getBrand() + ", " + "colore: " + colour +
				", " + earPhonesType() + ", " + "prezzo: " + getHumanGrossPrice() + ".";
	}

}
