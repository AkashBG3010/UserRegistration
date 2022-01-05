package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Your First Name: ");
		String firstName = sc.next();
		
		UserDetails userdetails = new UserDetails(firstName);
		UserRegistration registration = new UserRegistration();
		registration.register(userdetails);
	}
}