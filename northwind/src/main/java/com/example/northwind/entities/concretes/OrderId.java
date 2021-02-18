package com.example.northwind.entities.concretes;

import java.io.Serializable;

import javax.persistence.Column;

public class OrderId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "order_id")
	private int orderId;
	@Column(name = "customer_id")
	private String customerId;
	
}
