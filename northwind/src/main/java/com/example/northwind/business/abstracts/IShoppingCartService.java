package com.example.northwind.business.abstracts;

import java.util.Map;


import com.example.northwind.entities.concretes.Cart;

public interface ICartService {
	Map<String, Boolean> getById(Integer cartId);
	Map<String, Boolean> addToCart(Cart cart, Integer productId);
	Map<String, Boolean> deleteFromCart(String customerId, Integer productId, Integer decreaseNumber);
	

}
