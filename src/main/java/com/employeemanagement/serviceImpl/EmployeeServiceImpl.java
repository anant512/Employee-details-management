package com.employeemanagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemanagement.exceptions.ResourceNotFoundException;
import com.employeemanagement.model.Employee;
import com.employeemanagement.repository.EmployeeRepo;
import com.employeemanagement.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public Employee createEmployee(Employee employee) {
		Employee newemployee=this.employeeRepo.save(employee);
		return newemployee;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Employee employee= this.employeeRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee","id", id));
		return employee;
	}

	@Override
	public void deleteEmployee(Integer id) {
		
		Employee employee= this.employeeRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee","id", id));
		this.employeeRepo.delete(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employee=this.employeeRepo.findAll();
		return employee;
	}

}
