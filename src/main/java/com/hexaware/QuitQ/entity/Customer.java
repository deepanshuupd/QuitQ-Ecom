package com.hexaware.QuitQ.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long customerId;
	private String emailId;
	private String firstName;
	private String lastName;
	private String moblieNo;
	private String password;
	private LocalDateTime createdOn;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMoblieNo() {
		return moblieNo;
	}
	public void setMoblieNo(String moblieNo) {
		this.moblieNo = moblieNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public Customer(long customerId, String emailId, String firstName, String lastName, String moblieNo,
			String password, LocalDateTime createdOn) {
		super();
		this.customerId = customerId;
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.moblieNo = moblieNo;
		this.password = password;
		this.createdOn = createdOn;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", emailId=" + emailId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", moblieNo=" + moblieNo + ", password=" + password + ", createdOn="
				+ createdOn + "]";
	}
	
	
	

}
