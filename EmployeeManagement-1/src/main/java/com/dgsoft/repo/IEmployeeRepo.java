package com.dgsoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.dgsoft.entity.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Long>{

	@Query("update Employee set empName=:name where empId=:id")
	@Modifying
	void chnageEmployeeName(Long id, String name);

}
