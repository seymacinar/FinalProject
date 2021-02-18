package com.example.northwind.api.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.northwind.business.abstracts.ICartService;
import com.example.northwind.entities.concretes.Cart;

@RestController
@RequestMapping("/api/v1")
public class CartsController {
	
	@Autowired
	ICartService cartService;
	
	@GetMapping("/carts/{cart_id}")
	public Map<String, Boolean> getById(@PathVariable (value = "cartId") Integer cartId){
		return cartService.getById(cartId);
	}
	
	@PostMapping("/carts/{product_id}")
	public Map<String, Boolean> addToCart( @RequestBody Cart cart, @PathVariable(value = "product_id") Integer productId){
		return cartService.addToCart(cart, productId);
	}
	
	@DeleteMapping("/carts/{customer_id}/{product_id}/{decrease_number}")
	public Map<String, Boolean> deleteFromCart(@PathVariable (value = "customer_id") String customerId, @PathVariable (value = "product_id") Integer productId, @PathVariable (value = "decrease_number") Integer decreaseNumber){
		return cartService.deleteFromCart(customerId, productId, decreaseNumber);
	}
	
	
	
	
	
	

}
