package com.dgsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgsoft.entity.Employee;
import com.dgsoft.repo.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private IEmployeeRepo repo;

	@Override
	public Long createEmployee(Employee employee) {
		
		Employee savedEmployee = repo.save(employee);
		return savedEmployee.getEmpId();
	}
	
}
