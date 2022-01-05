package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegrexMain {
	
	private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	public void register(UserDetails userDetail) {
		validateUserDetails(userDetail);
	}
	private void validateUserDetails(UserDetails userDetail) {
		Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
		Matcher matcher = pattern.matcher(userDetail.getFirstName());
		boolean isValid = matcher.matches();
		
		if(isValid) {
			System.out.println("Entered name is valid");
		}
		else {
			System.out.println("Entered name is not valid. Please try again!");
		}
	}
}