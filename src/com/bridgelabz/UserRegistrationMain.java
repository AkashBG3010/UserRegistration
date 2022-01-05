package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter Your First Name: ");
		String firstName = scanner.next();
		System.out.println("Please enter Your Last Name: ");
		String lastName = scanner.next();
		System.out.println("Please enter your E-mail: ");
		String email = scanner.next();
		System.out.println("Please enter your PhoneNumber: ");
		String phoneNumber = scanner.next();
		System.out.println("Please enter your Password: ");
		String password = scanner.next();
		
		UserDetails userDetails = new UserDetails(firstName);
		userDetails.setFirstName(firstName);
		userDetails.setLastName(lastName);
		userDetails.setEmail(email);
		userDetails.setEmail(phoneNumber);
		userDetails.setEmail(password);
		
		UserRegistration registration = new UserRegistration();
		registration.register(userDetails);
	}
}