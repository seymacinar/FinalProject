package com.example.northwind.entities.concretes;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class OrderDetailId implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "product_id")
	private int productId;
	@Column(name = "order_id")
	private int orderId;

}
