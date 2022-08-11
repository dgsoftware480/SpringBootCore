package com.dgsoft.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgsoft.entity.Employee;
import com.dgsoft.exception.EmployeeNotFoundException;
import com.dgsoft.repo.IEmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo repo;

	@Override
	public Long createEmployee(Employee employee) {
		Employee savedEmployee = repo.save(employee);
		return savedEmployee.getEmpId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> optional = repo.findById(id);

		if (optional.isPresent()) {
			return optional.get();
		} else {
			 throw new EmployeeNotFoundException("Employee with '"+id+"' not found");
		}
	}

	@Override
	public void deleteEmployee(Long id) {
		//repo.deleteById(id);
		repo.delete(getEmployeeById(id));
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		Long id = employee.getEmpId();
		if(id!=null && repo.existsById(id)) {
			repo.save(employee);
		}else {
			throw new EmployeeNotFoundException("Employee '"+id+"' not exist");
		}
	}

	@Override
	@Transactional
	public void updateEmployeeName(Long id, String name) {
		if(id!=null && repo.existsById(id)) {
			repo.chnageEmployeeName(id, name);
		}else {
			throw new EmployeeNotFoundException("Employee '"+id+"' not exist");
		}
		
	}

}
