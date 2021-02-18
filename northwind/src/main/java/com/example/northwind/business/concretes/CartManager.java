package com.example.northwind.business.concretes;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.northwind.business.abstracts.ICartService;
import com.example.northwind.dataaccess.concretes.CartRepository;
import com.example.northwind.entities.concretes.Cart;

@Service
public class CartManager implements ICartService {
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Map<String, Boolean> getById(Integer cartId) {
		cartRepository.findById(cartId);
		
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("id'ye göre listelendi.", Boolean.TRUE);
		
		return response;
	}

	@Override
	public Map<String, Boolean> addToCart(Cart cart, Integer productId) {
		
		List<Cart> list = cartRepository.productInCart(cart.getCustomerId(), productId);
		
		if(list.size() > 0) {
			Cart cart2 = list.get(0);
			int count = cart2.getQuantity() + cart.getQuantity();
			cart2.setQuantity(count);
			
			cartRepository.save(cart2);
		}
		
		else {
			cartRepository.save(cart);
		}
		 
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("sepete eklendi.", Boolean.TRUE);
		
		return response;	
		
	}

	@Override
	public Map<String, Boolean> deleteFromCart(String customerId, Integer productId, Integer decreaseNumber ) {

		List<Cart> list = cartRepository.productInCart(customerId, productId);
		int newQuantity = list.get(0).getQuantity() - decreaseNumber; 
		
		Cart cart2 = list.get(0);
		
		Map<String, Boolean> response = new HashMap<String, Boolean>();

		if(newQuantity > 0) {
			cart2.setQuantity(newQuantity);
			cartRepository.save(cart2);
			response.put("sepetten silindi.", Boolean.TRUE);

		}
		else {
			cartRepository.delete(cart2);
			response.put("sepet silindi.", Boolean.TRUE);

		}
		
		return response;
	}

	

	
}
