package com.ashish.spring.dao;

import org.springframework.stereotype.Repository;

import com.ashish.spring.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{

	public void saveInDatabase(Employee employee) {

		/*
		 * Logic to save in DB goes here
		 */
		System.out.println("Employee "+employee.getName()+" is registered for assessment on "+ employee.getAssessmentDate());
		
	}

}
