package com.lti.user.services;

import com.lti.user.entity.User;
import com.lti.user.valueobject.ResponseTemplateVO;

public interface UserService {
	public User saveUser(User user);
	
	public ResponseTemplateVO getUserwithDept(Long userId);
}
