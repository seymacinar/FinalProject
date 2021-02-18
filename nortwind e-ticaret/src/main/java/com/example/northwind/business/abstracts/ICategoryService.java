package com.example.northwind.business.abstracts;

import java.util.List;

import com.example.northwind.entities.concretes.Categories;

public interface ICategoryService {

	List<Categories> getAll();
	
}
