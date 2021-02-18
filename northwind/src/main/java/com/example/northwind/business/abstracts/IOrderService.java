package com.example.northwind.business.abstracts;

import java.util.Map;

import com.example.northwind.entities.concretes.Order;

public interface IOrderService {

	Map<String, Boolean> add(Order order);

}
