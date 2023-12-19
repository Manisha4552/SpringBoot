package com.helloWorld.controller.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userEntity")
public class UserEntities {
	
	@Id
	@GeneratedValue
	private Long userId;
	@Column(name="USER_NAME", length=50, nullable=false, unique=true)
	private String userName;
	@Column(name="FIRST_NAME", length=50,nullable=false)
	private String userFirstName;
	@Column(name="LAST_NAME", length=50,nullable=false)
	private String userLastName;
	@Column(name="EMAIL", length=50,nullable=false)
	private String userEmail;
	@Column(name="ROLE", length=50,nullable=false)
	private String userRole;
	@Column(name="SSN", length=50,nullable=false, unique=true)
	private String ssn;
	
	public UserEntities() {
		
	}

	public UserEntities(long userId, String userName, String userFirstName, String userLastName, String userEmail,
			String userRole, String ssn) {
		
		this.userId = userId;
		this.userName = userName;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userRole = userRole;
		this.ssn = ssn;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "UserEntities [userId=" + userId + ", userName=" + userName + ", userFirstName=" + userFirstName
				+ ", userLastName=" + userLastName + ", userEmail=" + userEmail + ", userRole=" + userRole + ", ssn="
				+ ssn + "]";
	}
	
	
	

}
