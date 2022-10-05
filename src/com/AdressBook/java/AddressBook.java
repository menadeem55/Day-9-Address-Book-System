package com.AdressBook.java;

import java.util.*;

public class AddressBook {

	Scanner sc = new Scanner(System.in);
	ArrayList<AddNewContact> contactArrayList = new ArrayList<AddNewContact>();

	public void addContact() {

		AddNewContact contact = new AddNewContact();

		System.out.println("Enter the First Name : ");
		contact.setFirstName(sc.next());
		System.out.println("Enter the Last Name : ");
		contact.setLastName(sc.next());
		System.out.println("Enter the Address: ");
		contact.setAddress(sc.next());
		System.out.println("Enter the City : ");
		contact.setCity(sc.next());
		System.out.println("Enter the State : ");
		contact.setState(sc.next());
		System.out.println("Enter the Zip code : ");
		contact.setZipCode(sc.next());
		System.out.println("Enter the Mobile Number : ");
		contact.setMobileNum(sc.next());
		System.out.println("Enter the Email ID : ");
		contact.setEmailId(sc.next());

		contactArrayList.add(contact);
	}

	public void displayContact() {

		for (int i = 0; i < contactArrayList.size(); i++) {
			AddNewContact contact = contactArrayList.get(i);
			System.out.println(contact.toString());
		}

	}
}

