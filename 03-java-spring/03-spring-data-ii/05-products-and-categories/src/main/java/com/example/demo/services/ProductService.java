package com.example.demo.services;








import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Category;
import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;


@Service
public class ProductService {
	@Autowired
	ProductRepository pRepo;

	public void create(Product product) {
		// TODO Auto-generated method stub
		pRepo.save(product);
	}

	public Product findById(Long id) {
		// TODO Auto-generated method stub
		return pRepo.findById(id).orElse(null);
	}
	
	public Product update(Product product) {
		return pRepo.save(product);
	}

	public List<Product> findByCategoryNotContain(Category cat) {
		// TODO Auto-generated method stub
		return pRepo.findByCategoriesNotContains(cat);
	}



	
}
