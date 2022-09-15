package com.lti.department.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.department.entity.Department;
import com.lti.department.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DeparmentService{

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDept(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public Optional<Department> fetchDeptById(Long deptId) {
		return departmentRepository.findById(deptId);
	}
	

}
