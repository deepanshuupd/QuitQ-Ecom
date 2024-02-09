package com.hexaware.QuitQ.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cartitem")
public class CartItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cartItemId;
	private Integer cartItemQuantity;
	public long getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(long cartItemId) {
		this.cartItemId = cartItemId;
	}
	public Integer getCartItemQuantity() {
		return cartItemQuantity;
	}
	public void setCartItemQuantity(Integer cartItemQuantity) {
		this.cartItemQuantity = cartItemQuantity;
	}
	public CartItem(long cartItemId, Integer cartItemQuantity) {
		super();
		this.cartItemId = cartItemId;
		this.cartItemQuantity = cartItemQuantity;
	}
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CartItem [cartItemId=" + cartItemId + ", cartItemQuantity=" + cartItemQuantity + "]";
	}

}
