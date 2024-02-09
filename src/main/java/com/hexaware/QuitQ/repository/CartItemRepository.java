package com.hexaware.QuitQ.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.QuitQ.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long>{

}
