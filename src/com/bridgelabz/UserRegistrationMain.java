package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Your First Name: ");
		String firstName = scanner.next();
		System.out.println("Please enter Your Last Name: ");
		String lastName = scanner.next();
		
		UserDetails userDetails = new UserDetails(firstName);
		userDetails.setFirstName(firstName);
		userDetails.setLastName(lastName);
		
		UserRegistration registration = new UserRegistration();
		registration.register(userDetails);
	}
}