package com.labsession1.service;

import java.util.Scanner;

import com.labsession1.model.Employee;

public class DriverClass {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Harshit", "choudhary");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Please select the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		if(option == 1) {
			generatedEmail = cs.generateEmailAddress (employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase() ,"tech" );
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		
		if(option == 2) {
			generatedEmail = cs.generateEmailAddress (employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase() ,"Adm" );
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		
		if(option == 3) {
			generatedEmail = cs.generateEmailAddress (employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase() ,"hr" );
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		
		if(option == 4) {
			generatedEmail = cs.generateEmailAddress (employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase() ,"lg" );
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
	
		else
			System.out.println("Enter a valid option");
		
		sc.close();
	}
	

}
