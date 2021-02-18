package com.example.northwind.business.concretes;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.northwind.business.abstracts.IOrderService;
import com.example.northwind.dataaccess.concretes.OrderRepository;
import com.example.northwind.entities.concretes.Order;

@Service
public class OrderManager implements IOrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	
	@Override
	public Map<String, Boolean> add(Order order) {
				
		orderRepository.save(order);

		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("siparis verildi.", Boolean.TRUE);
		
		
		
		return response;
		
			
		
	}
		
}
