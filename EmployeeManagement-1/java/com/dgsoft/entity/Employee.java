package com.dgsoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "emptb")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eid")
	private Long empId;
	
	@Column(name = "ename")
	private String empName;
	
	@Column(name = "esar")
	private Double empSal;
	
	@Column(name = "egen")
	private String empGen;
	
	@Column(name = "edept")
	private String empDept;
	

}
