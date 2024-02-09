package com.hexaware.QuitQ.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.QuitQ.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
