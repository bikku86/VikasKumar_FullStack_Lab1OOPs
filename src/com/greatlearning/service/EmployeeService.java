package com.greatlearning.service;
import com.greatlearning.model.Employee;

public interface EmployeeService {
public String generateEmailID(String firstName, String lastName, String deptName);
public String generatePassword();
public void showEmployeeDetails(Employee e);
}
