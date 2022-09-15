package com.lti.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lti.user.entity.User;
import com.lti.user.repository.UserRepository;
import com.lti.user.valueobject.Department;
import com.lti.user.valueobject.ResponseTemplateVO;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public User saveUser(User user) {
		System.out.println("User Current Thread: "+ Thread.currentThread().getStackTrace()[2].getMethodName());
		return userRepository.save(user);
	}

	@Override
	public ResponseTemplateVO getUserwithDept(Long userId) {
		System.out.println("Hello getUserwithDept for userId: "+userId);
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDeptId() ,Department.class);
		System.out.println("Current Thread getUSerwithDeptId: "+ Thread.currentThread().getStackTrace()[2].getMethodName());
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;
	}
	/*
	@Override
	public User findByUserId(Long userId) {

		return null;
	}
	*/
}
