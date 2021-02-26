package com.amitu.department.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.amitu.department.repository.DepartmentRepository;

public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

}
