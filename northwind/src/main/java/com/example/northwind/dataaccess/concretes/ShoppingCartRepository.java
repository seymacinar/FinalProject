package com.example.northwind.dataaccess.concretes;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.northwind.entities.concretes.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Integer>{
	
	@Query(value="SELECT * FROM shopping_carts WHERE customer_id = :customerId AND product_id = :productId", nativeQuery = true)
	public List<ShoppingCart> productInCart(@Param("customerId") String customerId, @Param("productId") Integer productId);

	@Query(value = "SELECT * FROM shopping_carts where customer_id = :customerId" , nativeQuery = true)     
	public List<ShoppingCart> customersCart(@Param("customerId") String customerId);
	 
	
}