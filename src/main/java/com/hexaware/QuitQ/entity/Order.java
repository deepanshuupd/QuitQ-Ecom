package com.hexaware.QuitQ.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long orderId;
	private double totalAmount;
	private LocalDate orderDate;
	private boolean orderStatus;
	

}
