package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
	private int userId;
	private String userName;
	private String userAddress;
	private String mobileNumber;	
	private String emailId;
	private String password;
//	private String userType;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
public User(int userId, String userName, String userAddress, String mobileNumber, String emailId, String password) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userAddress = userAddress;
	this.mobileNumber = mobileNumber;
	this.emailId = emailId;
	this.password = password;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserAddress() {
	return userAddress;
}
public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", mobileNumber="
			+ mobileNumber + ", emailId=" + emailId + ", password=" + password + "]";
}


		
}
