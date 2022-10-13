package com.employeemanagement.service;

import java.util.List;

import com.employeemanagement.model.Employee;

public interface EmployeeService {
	
	// create employee 
	
	Employee createEmployee(Employee employee);
	
	// get employee by Id
	
	Employee getEmployeeById(Integer id);
	
	// get all employee 
	List<Employee> getAllEmployee();
	
	// delete employee by id 
	
	void deleteEmployee(Integer id);
	
	

}
