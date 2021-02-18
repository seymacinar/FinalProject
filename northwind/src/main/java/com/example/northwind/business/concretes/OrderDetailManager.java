package com.example.northwind.business.concretes;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.northwind.dataaccess.concretes.OrderDetailRepository;

public class OrderDetailManager {
	
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	
	
}
