package com.lti.department.services;

import java.util.Optional;

import com.lti.department.entity.Department;

public interface DeparmentService {
	
	public Department saveDept(Department department);
	
	public Optional<Department> fetchDeptById(Long deptId);

}
