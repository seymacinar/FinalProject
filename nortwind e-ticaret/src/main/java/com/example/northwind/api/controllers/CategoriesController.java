package com.example.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.northwind.business.abstracts.ICategoryService;
import com.example.northwind.entities.concretes.Categories;

@RestController
@RequestMapping("/api/v1")
public class CategoriesController {
	
	@Autowired
	ICategoryService categoryService;
	
	@GetMapping("/categories")
	public List<Categories> getAll() {
		return categoryService.getAll();
	}
}
