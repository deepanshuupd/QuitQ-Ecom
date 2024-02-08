package com.hexaware.QuitQ.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seller {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long sellerId;
	private String firstName;
	private String lastName;
	private String password;
	private String emailId;
	private String mobileNo;
	List<Product> products;

}
