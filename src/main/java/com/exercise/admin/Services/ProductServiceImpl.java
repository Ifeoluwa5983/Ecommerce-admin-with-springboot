package com.exercise.admin.Services;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.admin.adminDAO.ProductRepository;
import com.exercise.admin.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	


	@Override
	public List<Product> findAll() {
		return productRepo.findAll();
	}

	@Override
	public Optional<Product> getProductbyId(int productId) {
		return productRepo.findById(productId);
	}

	@Override
	public void saveAll(Product product) {
		productRepo.save(product);
		
	}

	@Override
	public void deleteById(int productId) {
		productRepo.deleteById(productId);
		
	}
	

}
