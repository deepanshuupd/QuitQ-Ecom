package com.hexaware.QuitQ.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="order")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long orderId;
	private double totalAmount;
	private LocalDate orderDate;
	private OrderStatusValues orderStatus;
	List<CartItem> ordercartItems = new ArrayList<>();
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public OrderStatusValues getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatusValues orderStatus) {
		this.orderStatus = orderStatus;
	}
	public List<CartItem> getOrdercartItems() {
		return ordercartItems;
	}
	public void setOrdercartItems(List<CartItem> ordercartItems) {
		this.ordercartItems = ordercartItems;
	}
	public Order(long orderId, double totalAmount, LocalDate orderDate, OrderStatusValues orderStatus,
			List<CartItem> ordercartItems) {
		super();
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.ordercartItems = ordercartItems;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", totalAmount=" + totalAmount + ", orderDate=" + orderDate
				+ ", orderStatus=" + orderStatus + ", ordercartItems=" + ordercartItems + "]";
	}

}
