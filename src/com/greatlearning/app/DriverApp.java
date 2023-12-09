package com.greatlearning.app;
import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImp;

public class DriverApp {
	
public static void main(String[] args) {
	    EmployeeServiceImp empImp=new EmployeeServiceImp();
		Scanner sc=new Scanner(System.in);
		String firstName;
		String lastName;
		int choice;
		String genEmail="";
		String genPassword="";
		
		do
		{
		
		System.out.println("Please enter your first name: ");
		firstName=sc.next();
		System.out.println("Please enter your last name: ");
		lastName=sc.next();
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
				
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:genEmail=empImp.generateEmailID(firstName.toLowerCase(), lastName.toLowerCase(), "tech");
			   break;
		case 2:genEmail=empImp.generateEmailID(firstName.toLowerCase(), lastName.toLowerCase(), "admin");
			   break;
		case 3:genEmail=empImp.generateEmailID(firstName.toLowerCase(), lastName.toLowerCase(), "hr");
			   break;
		case 4:genEmail=empImp.generateEmailID(firstName.toLowerCase(), lastName.toLowerCase(), "legal");
			   break;
		default:System.out.println("Please Enter the valid input\n");
		 		choice=0;
		 	}
}while(choice==0);
		
		genPassword=empImp.generatePassword();
		
		Employee e1=new Employee();
		e1.setFirstName(firstName);
		e1.setLastName(lastName);
		e1.setEmailID(genEmail);
		e1.setPassword(genPassword);
		
		empImp.showEmployeeDetails(e1);
		
		sc.close();
	}



}
