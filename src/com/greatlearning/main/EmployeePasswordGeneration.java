package com.greatlearning.main;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import com.greatlearning.service.DriverService;

public class EmployeePasswordGeneration {

	public static void main(String[] args) {
		
		//getting inputs
		DriverService driverService = new DriverService();
		
		Employee employee = driverService.getFirstNameAndLastName();
		int id = driverService.getDepartmentId();
		
		//generating credentials
		CredentialService credentialService = new CredentialService();
		
		String email = credentialService.generateEmailAddress(employee,id);
		String password = credentialService.generatePassword();
		
		//showing credentials
		credentialService.showCredentials(employee, email, password);
	}
}
