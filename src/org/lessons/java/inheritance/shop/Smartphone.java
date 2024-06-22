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
	
}
