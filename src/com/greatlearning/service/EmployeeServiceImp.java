package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImp implements EmployeeService {
	
	@Override
	public String generateEmailID(String firstName, String lastName, String deptName) {
				return firstName+lastName+"@"+deptName+".greatlearning.com";
	}

	@Override
	public String generatePassword() {
		
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower=caps.toLowerCase();
		String nums="0123456789";
		String splchars="!@#$%^&*()";
		String combined=caps+lower+nums+splchars;
		String myPass="";
		Random random=new Random();
		for(int i=1;i<=8;i++)
		{
		myPass=myPass+String.valueOf(combined.charAt(random.nextInt(combined.length())));
	}
		return myPass;
	}
		
	@Override
	public void showEmployeeDetails(Employee e1) {
		System.out.println("Dear "+e1.getFirstName()+" "+e1.getLastName()+" your generated credentials are as follows");
		System.out.println("Email    ---> "+e1.getEmailID());
		System.out.println("Password ---> "+e1.getPassword());
		
		//System.out.println("Employee first name:"+e1.getFirstName());
		//System.out.println("Employee last name:"+e1.getLastName());
		//System.out.println("Employee Email:"+e1.getEmailID());
		//System.out.println("Employee password:"+e1.getPassword());
	}
}
