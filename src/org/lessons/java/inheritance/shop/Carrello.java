package org.lessons.java.inheritance.shop;

import java.util.Scanner;

public class Carrello {
	
	public static void main(String[] args) {
		// initialize array of Prodotto
		Prodotto[] carrello = new Prodotto[0];
		
		// new scanner instance 
		Scanner scanner = new Scanner(System.in);
		
		// initialize control variable to stop do-while loop
		boolean repeatLoop = true;
		
		// do-while loop to fill carrello
		do {
		System.out.println("Vuoi aggiungere un prodotto al carrello?");
		String userPurpose = scanner.nextLine();
		
		// if userPurpose == "si", ask user to insert Prodotto fields
		if (userPurpose.equals("si")) {
			// initialize newProd to null
			Prodotto newProd = null;
			
			// user inputs
			System.out.println("Inserisci il nome del prodotto:");
			String prodName = scanner.nextLine();
			System.out.println("Inserisci la marca del prodotto:");
			String prodBrand = scanner.nextLine();
			System.out.println("Inserisci il prezzo del prodotto:");
			String prodPrice = scanner.nextLine();
			System.out.println("Inserisci l'iva del prodotto:");
			String prodVat = scanner.nextLine();
			System.out.println("Che tipo di prodotto è " + prodName + " ?");
			String prodType = scanner.nextLine().toLowerCase();
			
			// if prodType is equal to an existing class, create a new object of that class
			if (prodType.equals("smartphone")) {
				System.out.println("Inserisci il codice Imei dello smartphone:");
				String prodImei = scanner.nextLine();
				System.out.println("Quanti GB di memoria ha lo smartphone?");
				String prodStorage = scanner.nextLine();
				Smartphone newPhone = new Smartphone(prodName, prodBrand, prodPrice, prodVat, prodImei, prodStorage);
				newProd = newPhone;
			} else if (prodType.equals("televisione")) {
				System.out.println("Inserisci la dimensione della televisione in pollici:");
				String prodDimension = scanner.nextLine();
				System.out.println("E' una televisione smart?");
				String prodIsSmart = scanner.nextLine();
				Televisione newTV = new Televisione(prodName, prodBrand, prodPrice, prodVat, prodDimension, prodIsSmart);
				newProd = newTV;
			} else if (prodType.equals("cuffie")) {
				System.out.println("Inserisci il colore delle cuffie:");
				String prodColour = scanner.nextLine();
				System.out.println("Le cuffie sono wireless?");
				String prodIsWireless = scanner.nextLine();
				Cuffie newEarphones = new Cuffie(prodName, prodBrand, prodPrice, prodVat, prodColour, prodIsWireless);
				newProd = newEarphones;
			} else {
				// otherwise print a message
				System.out.println("Questo tipo di prodotto non può essere inserito.");
			}
			
			// create a copy of carrello
			Prodotto[] newCarrello = new Prodotto[carrello.length + 1];
			for(int i = 0; i < carrello.length ; i++) {
				newCarrello[i] = carrello[i];
			}
			// add newProd to newCarrello
			newCarrello[newCarrello.length - 1] = newProd;
			// carrello points to newCarrello
			carrello = newCarrello;
			
		} else {
			// prints carrello contents
			if (carrello.length == 0) {
				System.out.println("Il carrello è vuoto.");
			} else {
				System.out.println("Nel carrello sono presenti i seguenti articoli:");
				for (Prodotto prodotto : carrello) {
					System.out.println(prodotto.toString());
				}
				System.out.println("-----------------------------------------------");
			}
			repeatLoop = false;
		}
		} while(repeatLoop);
		scanner.close();
	}

}
