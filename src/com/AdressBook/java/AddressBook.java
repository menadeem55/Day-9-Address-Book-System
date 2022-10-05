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
		contact.setZipCode(sc.nextDouble());
		System.out.println("Enter the Mobile Number : ");
		contact.setMobileNum(sc.nextDouble());
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
	public void editContact() {

		System.out.println("Enter the First Name to Edit : ");
		String FirstName = (sc.next());
		boolean IsAvaible = false;

		for (AddNewContact contact : contactArrayList) {
			if (contact.getFirstName().equals(FirstName)) {
				IsAvaible = true;

				System.out.println("Enter the First Name : ");
				contact.setFirstName(sc.next());
				System.out.println("Enter the Last Name : ");
				contact.setLastName(sc.next());
				System.out.println("Enter the Address : ");
				contact.setAddress(sc.next());
				System.out.println("Enter the City : ");
				contact.setCity(sc.next());
				System.out.println("Enter the State : ");
				contact.setState(sc.next());
				System.out.println("Enter the Zipcode : ");
				contact.setZipCode(sc.nextDouble());
				System.out.println("Enter the Mobile Number : ");
				contact.setMobileNum(sc.nextDouble());
				System.out.println("Enter the Email Id : ");
				contact.setEmailId(sc.next());
			}
		}

		if (IsAvaible == false) {
			System.out.println("Not Availabe");
		}
}
}