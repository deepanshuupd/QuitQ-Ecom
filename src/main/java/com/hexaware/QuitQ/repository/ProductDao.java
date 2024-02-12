package com.hexaware.QuitQ.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.QuitQ.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{

}
