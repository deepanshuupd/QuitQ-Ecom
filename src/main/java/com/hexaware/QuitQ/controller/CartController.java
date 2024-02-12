package com.hexaware.QuitQ.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
	@GetMapping(value = "/cart/add")
	public ResponseEntity<String> addProductToCartHander(){
		System.out.print("This is Card Add Product Page");
		return ResponseEntity.status(HttpStatus.CREATED).body("Product added to the cart successfully");
	}
}
