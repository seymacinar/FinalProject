package com.example.northwind.entities.concretes;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.example.northwind.entities.abstracts.IEntity;

import lombok.Data;

@Data
@Entity
@Table(name = "shopping_carts")
public class ShoppingCart implements IEntity, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private int cartId;
	@Id
	@Column(name = "product_id")
	private int productId;
	@Id
	@Column(name = "customer_id")
	private String customerId;
	@Column(name="quantity")
	private int quantity;
}
