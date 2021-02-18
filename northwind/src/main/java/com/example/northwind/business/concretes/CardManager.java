package com.example.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.northwind.business.abstracts.ICardService;
import com.example.northwind.dataaccess.concretes.CardRepository;

@Service
public class CardManager implements ICardService{

	@Autowired
	private CardRepository cardRepository;
}
