package com.ecomm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable 
{
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	int loginName;
	String password;
	String CustomerName;
	String EmailID;
	String MobileNo;
	String CustomerAddr;
	
	
	public int getLoginName() {
		return loginName;
	}
	public void setLoginName(int loginName) {
		this.loginName = loginName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getEmailId() {
		return EmailID;
	}
	public void setEmailId(String emailId) {
		EmailID = emailId;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getCustomerAddr() {
		return CustomerAddr;
	}
	public void setCustomerAddr(String customerAddr) {
		CustomerAddr = customerAddr;
	}
	
}