package com.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.model.Employee;
import com.employeemanagement.payload.ApiResponse;
import com.employeemanagement.service.EmployeeService;



@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	

	
	@PostMapping("/saveemployee")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
		Employee newemployee =this.employeeService.createEmployee(employee);
		return new ResponseEntity<Employee>(newemployee,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/employee/{id}")
	public ApiResponse  deleteEmployee(@PathVariable Integer id) {
		this.employeeService.deleteEmployee(id);
		return new ApiResponse("Employee is successfully deleted with id :" +id, true);
		
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) {
		Employee employee=this.employeeService.getEmployeeById(id);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK) ;
	}
	
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employee=this.employeeService.getAllEmployee();
		return new ResponseEntity<List<Employee>>(employee,HttpStatus.OK);
	}
	

}
