package com.exercise.admin.Services;

import java.util.List;
import java.util.Optional;

import com.exercise.admin.entity.Product;

public interface ProductService {
	
	public List<Product> findAll();
	
	public Optional<Product> getProductbyId(int productId);
	
	public void saveAll(Product product);
	
	public void deleteById(int productId);

}
