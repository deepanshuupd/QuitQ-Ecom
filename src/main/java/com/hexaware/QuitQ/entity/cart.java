package com.hexaware.QuitQ.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cartId;
	private double cartTotal;

}
