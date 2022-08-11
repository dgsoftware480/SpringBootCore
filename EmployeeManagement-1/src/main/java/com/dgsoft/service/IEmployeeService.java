package com.dgsoft.service;

import java.util.List;

import com.dgsoft.entity.Employee;

public interface IEmployeeService {

	Long createEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(Long id);

	void deleteEmployee(Long id);

	void updateEmployee(Employee employee);
	
	void updateEmployeeName(Long id, String name);
	
	
	
}
