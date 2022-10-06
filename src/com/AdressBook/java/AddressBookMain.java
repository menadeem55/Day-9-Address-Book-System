package com.AdressBook.java;

import java.util.*;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book");
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);

		int Number;

		do {
			System.out.println(" 1. Add Contact \n 2. Display contact \n");
			System.out.println("Enter the  Number: ");

			Number = sc.nextInt();

			switch (Number) {

			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.displayContact();
				break;
			default:
				System.out.println(" Invalid Input! ");
				break;

			}
		} while (Number < 3);
	}

}
