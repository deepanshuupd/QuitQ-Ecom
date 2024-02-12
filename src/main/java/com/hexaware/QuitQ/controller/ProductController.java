package com.hexaware.QuitQ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.QuitQ.entity.Product;
import com.hexaware.QuitQ.service.ProductService;

@RestController
public class ProductController {
	

	@Autowired
	private ProductService pService;
	@PostMapping("/products")
	public ResponseEntity<Product> addProductToCatalogHandler(@RequestBody Product product) {

		Product prod = pService.addProductToCatalog(product);

		return new ResponseEntity<Product>(prod, HttpStatus.ACCEPTED);

	}
}