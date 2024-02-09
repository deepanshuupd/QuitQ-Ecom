package com.hexaware.QuitQ.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.QuitQ.entity.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
