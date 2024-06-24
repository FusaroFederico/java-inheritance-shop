package org.lessons.java.inheritance.shop;

import java.util.Random;

public class Prodotto {
		// instance variables
		private int code;
		private String name;
		private String brand;
		private double price;
		private int vat;
		// constructor method
		public Prodotto(String name, String brand, double price, int vat) {
			// new instance for random number
			Random random = new Random();
			// max 8-digit random number
			this.code = 1 + random.nextInt(99999999);
			this.name = name;
			this.brand = brand;
			this.price = price;
			this.vat = vat;
		}
		// constructor Overload
		public Prodotto(String name, String brand, String price, String vat) {
			// new instance for random number
			Random random = new Random();
			// max 8-digit random number
			this.code = 1 + random.nextInt(99999999);
			this.name = name;
			this.brand = brand;
			this.price = Double.parseDouble(price);
			this.vat = Integer.parseInt(vat);
		}
		// Getters and Setters
		public int getCode() {
			return code;
		}
		private void setCode(int code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getVat() {
			return vat;
		}
		public void setVat(int vat) {
			this.vat = vat;
		}
		// getGrossPrice method
		public double getGrossPrice() {
			return price + price * vat / 100;
		}
		// getFullName method
		public String getFullName() {
			return code + "-" + name;
		}
		// getHumanGrossPrice method
		public String getHumanGrossPrice() {
			double grossPrice = price + price * vat / 100;
			return String.format("%.2f euro", grossPrice);
		}
		// createPaddedCode static method
		public static String createPaddedCode(int code) {
			return String.format("%08d", code);
		}
		// generatePaddedCode static method
		public static String generatePaddedCode(int code) {
		      if ( Integer.toString(code).length() != 8){
		      	String padding = "";
		 			for ( int i = 0; i < (8 - Integer.toString(code).length()); i++){
		 			String zeroString = padding + "0";
		      	padding = zeroString;
		      	}
		          return padding + code;
		      } else {
		      return Integer.toString(code);
		      }
		}
		// generateRandomPaddedCode static method
		public static String generateRandomPaddedCode() {
			Random random = new Random();
			// max 4-digit random code
			int randomCode = 1 + random.nextInt(9999);
			return String.format("%08d", randomCode);
		}
		// toString method
		public String toString() {
			return "Prodotto: " + getFullName() + ", " + brand + ", " + price + " euro, " + "IVA " + vat + "%.";
		}
}
