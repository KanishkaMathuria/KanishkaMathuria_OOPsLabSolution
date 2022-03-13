package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;


public class CredentialService {
	
	//generate password
	public String generatePassword() {
		StringBuilder stringBuilder = new StringBuilder(8);
		String password = "";
		Random random = new Random();
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
		          +"jklmnopqrstuvwxyz!@#$%&";
		
		for(int i=0;i<8;i++) {
			stringBuilder.append(chars.charAt(random.nextInt(chars.length())));
		}
		
		password = stringBuilder.toString();
		
		return password;
	}
	
	//generate email
	public String generateEmailAddress(Employee employee,int id) {
		
		String email = "";
		
		switch(id) {
		case 1: email = employee.getFirstName()+employee.getLastName()+"@tech.greatlearning.com";
		break;
		case 2: email = employee.getFirstName()+employee.getLastName()+"@admin.greatlearning.com";
		break;
		case 3: email = employee.getFirstName()+employee.getLastName()+"@hr.greatlearning.com";
		break;
		case 4: email = employee.getFirstName()+employee.getLastName()+"@legal.greatlearning.com";
		break;
		}
		
		return email;
		
	}

	//show credentials
	public void showCredentials(Employee employee,String email,String password) {
		
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows:");
		System.out.println("Email --> "+email);
		System.out.println("Password --> "+password);
		
	}
	
}
