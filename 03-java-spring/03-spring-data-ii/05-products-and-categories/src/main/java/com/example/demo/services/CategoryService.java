package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Category;
import com.example.demo.models.Product;
import com.example.demo.repositories.CategoryRepository;

@Service
public class CategoryService  {
	
	@Autowired
	private CategoryRepository cRepo;

	public void create( Category category) {
		// TODO Auto-generated method stub
		cRepo.save(category);
	}

	public Category findById(Long id) {
		// TODO Auto-generated method stub
		return cRepo.findById(id).orElse(null);
	}
	
	public List<Category> findByProductNotContain(Product product){
		return cRepo.findByProductsNotContains(product);
	}

	public Category update(Category category) {
		// TODO Auto-generated method stub
		return cRepo.save(category);
	}
}

	
