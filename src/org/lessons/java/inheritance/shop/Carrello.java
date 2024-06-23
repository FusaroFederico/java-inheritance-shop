package org.lessons.java.inheritance.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		// initialize array of Product
		Prodotto[] carrello = new Prodotto[0];
		// new scanner instance 
		Scanner scanner = new Scanner(System.in);
		// user input
		System.out.println("Vuoi aggiungere un prodotto al carrello? ");
		String userPurpose = scanner.nextLine();
	}

}
