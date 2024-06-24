package org.lessons.java.inheritance.shop;

public class Smartphone extends Prodotto{
	// instance variables
	long imeiCode;
	int phoneStorage;
	
	// constructor method
	public Smartphone(String name, String brand, double price, int vat, long imeiCode, int phoneStorage) {
		super(name, brand, price, vat);
		this.imeiCode = imeiCode;
		this.phoneStorage = phoneStorage;
	}
	// constructor Overload
	public Smartphone(String name, String brand, String price, String vat, String imeiCode, String phoneStorage) {
		super(name, brand, price, vat);
		this.imeiCode = Long.parseLong(imeiCode);
		this.phoneStorage = Integer.parseInt(phoneStorage);
	}
	// Getters and Setters
	public long getImeiCode() {
		return imeiCode;
	}
	public void setImeiCode(long imeiCode) {
		this.imeiCode = imeiCode;
	}
	public int getPhoneStorage() {
		return phoneStorage;
	}
	public void setPhoneStorage(int phoneStorage) {
		this.phoneStorage = phoneStorage;
	}
	// Override toString method
	@Override
	public String toString() {
		return "Smartphone: " + getFullName() + ", " + getBrand() + ", " + phoneStorage + " GB, " +
				"IMEI: " + imeiCode + ", " + "prezzo: " + getHumanGrossPrice() + ".";
	}
}
