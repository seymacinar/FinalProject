package com.example.northwind.dataaccess.concretes;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.northwind.entities.concretes.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer>{
	
	@Query(value="SELECT * FROM carts WHERE customer_id = :customerId AND product_id = :productId", nativeQuery = true)
	public List<Cart> productInCart(@Param("customerId") String customerId, @Param("productId") Integer productId);

	//@Query(value = "SELECT * FROM carts where customer_id = :customerId" , nativeQuery = true)     
	//public List<Cart> customersCart(@Param("customerId") String customerId);
	 
	
}