package com.dgsoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dgsoft.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Long>{

}
