package com.dgsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgsoft.entity.Employee;
import com.dgsoft.exception.EmployeeNotFoundException;
import com.dgsoft.service.IEmployeeService;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;

	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		Long empid = service.createEmployee(employee);
		String message = "Employee created with '" + empid + "' in database";
		return new ResponseEntity<>(message, HttpStatus.CREATED);

	}

	@GetMapping("/list")
	public ResponseEntity<List<Employee>> listAllEmployee() {
		List<Employee> employees = service.getAllEmployees();
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
	}

	@GetMapping("/single/{id}")
	public ResponseEntity<?> listOneEmployee(@PathVariable Long id) {
		ResponseEntity<?> resp = null;

		try {
			Employee employee = service.getEmployeeById(id);
			resp = new ResponseEntity<Employee>(employee, HttpStatus.OK);
		} catch (EmployeeNotFoundException e) {
			throw e;
		}
		return resp;

	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removeEmployee(@PathVariable Long id) {
		ResponseEntity<String> resp = null;
		try {
			service.deleteEmployee(id);
			resp = new ResponseEntity<String>("Employee with '" + id + "' deleted", HttpStatus.OK);

		} catch (EmployeeNotFoundException e) {
			throw e;
		}
		return resp;
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee){
		try {
			service.updateEmployee(employee);
			return new ResponseEntity<String>("Employee '"+employee.getEmpId()+"' updated", HttpStatus.OK);
			}catch (EmployeeNotFoundException e) {
				throw e;
			}
	
	}
	
	@PatchMapping("/change/{id}/{name}")
	public ResponseEntity<String> updateEmployee(@PathVariable Long id, @PathVariable String name){
		try {
			service.updateEmployeeName(id, name);
			return new ResponseEntity<String>("Employee '"+id+"' updated", HttpStatus.OK);
			}catch (EmployeeNotFoundException e) {
				throw e;
			}
	
	}
	

	/*
	 * @GetMapping("/single/{id}") public ResponseEntity<?>
	 * listOneEmployee(@PathVariable Long id) { ResponseEntity<?> resp = null;
	 * 
	 * try { Employee employee = service.getEmployeeById(id); resp = new
	 * ResponseEntity<Employee>(employee, HttpStatus.OK); } catch
	 * (EmployeeNotFoundException e) { e.printStackTrace();
	 * System.out.println(e.getMessage()); resp = new
	 * ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	 * 
	 * }
	 * 
	 * return resp;
	 * 
	 * }
	 */

	/*
	 * @DeleteMapping("/remove/{id}") public ResponseEntity<String>
	 * removeEmployee(@PathVariable Long id) { ResponseEntity<String> resp = null;
	 * try { service.deleteEmployee(id); resp = new
	 * ResponseEntity<String>("Employee '" + id + "' Deleted ", HttpStatus.OK); }
	 * catch (EmployeeNotFoundException e) { e.printStackTrace(); resp = new
	 * ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	 * 
	 * } return resp; }
	 */

}
