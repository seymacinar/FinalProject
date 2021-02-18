package com.example.northwind.entities.concretes;

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
@Table(name = "customers")
public class Customer implements IEntity {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private String customerId;	
	@Column(name = "company_name")
	private String companyName;	
	@Column(name = "contact_name")
	private String contactName;	
	@Column(name = "phone")
	private String phone;	
	
}
