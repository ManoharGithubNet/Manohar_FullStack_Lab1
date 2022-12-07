package com.labsession1.service;

import java.util.Random;
//import java.util.Random.*;

import com.labsession1.model.Employee;

public class CredentialService {
	
	public char[] generatePassword() {
		
		String capitalLetters = "ABCEFGHIJKLMNOPQRTUVWXYZ";
		String smallLetters = "abcdefghijkmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%&*()_+-/.?<>";
		
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		//Using Random method
		
		Random random = new Random(); 
		
		char[] password = new char[8];
		
		for(int i=0; i<8; i++) {
			// Use of charAt() method to get character value
			// Use of nextInt as it is scanning the values as int 
			password[i] = values.charAt(random.nextInt(values.length()));
		
		}
		return password;
	}

	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+"abc.com";
	}

	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear "+employee.getFirstName()+ " your generted credentials are as follows ");
		System.out.println("Email -->"+ email);
		System.out.println("password--> 1" +"");
		System.out.println(generatedPassword);
	}
}
