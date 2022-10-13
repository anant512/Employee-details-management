package com.employeemanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="employee_details")
@NoArgsConstructor
@Data
@AllArgsConstructor
@Getter
@Setter
public class Employee {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	private Date dateOfJoining;
	private double salary;
	private String department;
	
	

}
