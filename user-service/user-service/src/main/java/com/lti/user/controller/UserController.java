package com.lti.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.user.entity.User;
import com.lti.user.services.UserService;
import com.lti.user.valueobject.ResponseTemplateVO;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		System.out.println("Inside save user method for post mapping with details as: " + user.toString());
		return userService.saveUser(user);
	}

	@GetMapping("/{id}")
	public ResponseTemplateVO getUserwithDept(@PathVariable("id") Long userId){
		System.out.println("Inside save user method for get mapping for userId: " + userId);
		return userService.getUserwithDept(userId);
	}
}
