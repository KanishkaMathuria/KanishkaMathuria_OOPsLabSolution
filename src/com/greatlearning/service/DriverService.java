package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverService {
	
	//get inputs
	public Employee getFirstNameAndLastName() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter First Name: ");
		String firstName = sc.nextLine();
		System.out.println("Please enter Last Name: ");
		String lastName = sc.nextLine();
		Employee emp = new Employee(firstName,lastName);
		
		return emp;
	}
	
	public int getDepartmentId() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please select the department from the following: \r\n 1. Technical \r\n 2. Admin \r\n 3. Human Resources \r\n 4. Legal");
		int id = sc.nextInt();
		
		return id;
	}
}
