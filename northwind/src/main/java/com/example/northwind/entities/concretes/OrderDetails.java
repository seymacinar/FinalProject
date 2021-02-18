package com.example.northwind.entities.concretes;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "order_details")
public class OrderDetails implements Serializable{
	
	@Id
	@Column(name = "order_id")
	private int orderId;
	@Id
	@Column(name = "product_id")
	private int productId;
	@Column(name = "quantity")
	private int quantity;
}
