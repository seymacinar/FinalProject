package com.example.northwind.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.northwind.business.abstracts.IOrderDetailService;

public class OrderDetailsController {
	
	@Autowired
	IOrderDetailService orderDetailService;
	
}
