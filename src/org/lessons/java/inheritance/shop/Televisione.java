package org.lessons.java.inheritance.shop;

public class Televisione extends Prodotto {
	// instance variables
	int dimension;
	boolean isSmart;
	//constructor method
	public Televisione(String name, String brand, double price, int vat, int dimension, boolean isSmart) {
		super(name, brand, price, vat);
		this.dimension = dimension;
		this.isSmart = isSmart;
	}
	// Getters and Setters
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public boolean isSmart() {
		return isSmart;
	}
	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}

}
