package com.ashish.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ashish.spring.configuration.AppConfig;
import com.ashish.spring.model.Employee;
import com.ashish.spring.service.EmployeeService;

public class AppMain {

	public static void main(String args[]){
		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");

		/*
		 * Register employee using service
		 */
		Employee employee = new Employee();
		employee.setName("Ashish Singh");
		service.registerEmployee(employee);
		
		context.close();
	}
}