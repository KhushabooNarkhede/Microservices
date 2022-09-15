package com.lti.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String fName;
	private String lName;
	private String email;
	private Long deptId;
	
	public User() {
		super();
	}

	public User(Long userId, String fName, String lName, String email, Long deptId) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.deptId = deptId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfName() {
		return fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public String getlName() {
		return lName;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	
	public Long getDeptId() {
		return deptId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", deptId="
				+ deptId + "]";
	}

}
