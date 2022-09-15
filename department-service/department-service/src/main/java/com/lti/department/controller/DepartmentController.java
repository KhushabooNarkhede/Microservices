package com.lti.department.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.department.entity.Department;
import com.lti.department.services.DeparmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DeparmentService deparmentService;
	
	@PostMapping("/")
	public Department saveDept(@RequestBody Department department) {
		System.out.println("Inside save  method DepartmentController for post mapping with details as: " + department.toString());
		return deparmentService.saveDept(department);
		
	}
	
	@GetMapping("/{id}")
	public Optional<Department> fetchDeptById(@PathVariable("id") Long deptId){
		System.out.println("Inside save  method DepartmentController for get mapping with details as " + deptId);
		return deparmentService.fetchDeptById(deptId);
	}
	
}
