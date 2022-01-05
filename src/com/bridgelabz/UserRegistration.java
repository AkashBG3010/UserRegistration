package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[a-z]+$";
	private static final String PHONE_NUMBER_REGEX = "^[789][0-9]{9}";
	private static final String PASSWORD_REGEX = "^[0-9 a-z A-Z @#$%^&-+=]{8,}$";
	
	public void register(UserDetails userDetail) {

		boolean isFirstNameValid = validateUserDetails(FIRST_NAME_REGEX,userDetail.getFirstName());
		boolean isLastNameValid = validateUserDetails(LAST_NAME_REGEX,userDetail.getLastName());
		boolean isEmailValid = validateUserDetails(EMAIL_REGEX,userDetail.getEmail());
		boolean isPhoneNumberValid = validateUserDetails(PHONE_NUMBER_REGEX,userDetail.getPhoneNumber());
		boolean isPasswordValid = validateUserDetails(PASSWORD_REGEX,userDetail.getPassword());
		
		if(isFirstNameValid && isLastNameValid && isEmailValid && isPhoneNumberValid && isPasswordValid) {
			System.out.println("Entered details are valid");
		}
		else {
			System.out.println("Entered Name (or) Email (or) PhoneNumber (or) Password is invalid. Please try again!");
		}
	}
	private boolean validateUserDetails(String regex, String dataToBeValidated) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(dataToBeValidated);
		return matcher.matches();
	}
}