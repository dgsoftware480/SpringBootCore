package com.dgsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgsoft.entity.Employee;
import com.dgsoft.service.IEmployeeService;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee){
		System.out.println(employee);
		Long empid = service.createEmployee(employee);
		String message = "Employee created with '"+empid+"' in database";
		return new ResponseEntity<>(message,HttpStatus.CREATED);
		
		
	}
}
