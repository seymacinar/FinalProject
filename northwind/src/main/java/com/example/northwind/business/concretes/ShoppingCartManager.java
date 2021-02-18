package com.example.northwind.business.concretes;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.northwind.business.abstracts.IShoppingCartService;
import com.example.northwind.dataaccess.concretes.CartRepository;
import com.example.northwind.entities.concretes.ShoppingCart;

@Service
public class ShoppingCartManager implements IShoppingCartService {
	@Autowired
	private CartRepository shoppingCartRepository;

	@Override
	public Map<String, Boolean> getById(Integer cartId) {
		shoppingCartRepository.findById(cartId);
		
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("id'ye göre listelendi.", Boolean.TRUE);
		
		return response;
	}

	@Override
	public Map<String, Boolean> addToCart(ShoppingCart cart, Integer productId) {
		
		List<ShoppingCart> list = shoppingCartRepository.productInCart(cart.getCustomerId(), cart.getProductId());
		
		if(list.size() > 0) {
			ShoppingCart cart2 = list.get(0);
			int count = cart2.getQuantity() + cart.getQuantity();
			cart2.setQuantity(count);
			
			shoppingCartRepository.save(cart2);
		}
		
		else {
			shoppingCartRepository.save(cart);
		}
		 
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("sepete eklendi.", Boolean.TRUE);
		
		return response;	
		
	}

	@Override
	public Map<String, Boolean> deleteFromCart(String customerId, Integer productId, Integer decreaseNumber ) {

		List<ShoppingCart> list = shoppingCartRepository.productInCart(customerId, productId);
		int newQuantity = list.get(0).getQuantity() - decreaseNumber; 
		
		ShoppingCart cart2 = list.get(0);
		
		Map<String, Boolean> response = new HashMap<String, Boolean>();

		if(newQuantity > 0) {
			cart2.setQuantity(newQuantity);
			shoppingCartRepository.save(cart2);
			response.put("sepetten silindi.", Boolean.TRUE);

		}
		else {
			shoppingCartRepository.delete(cart2);
			response.put("sepet silindi.", Boolean.TRUE);

		}
		
		return response;
	}

	

	
}
