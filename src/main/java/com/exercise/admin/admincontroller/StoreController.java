package com.exercise.admin.admincontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.admin.Services.ProductServiceImpl;
import com.exercise.admin.Services.StoreServiceImpl;
import com.exercise.admin.entity.Product;
import com.exercise.admin.entity.Store;

import java.util.Optional;

@RequestMapping("/api")
@RestController
public class StoreController {
	
	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	@Autowired
	private StoreServiceImpl storeServiceImpl;
	
	
	
	@GetMapping("/product")
	public List<Product> findAll(int productId) {
		return productServiceImpl.findAll(productId);
	}
	
	@GetMapping("/product/{productId}")
	public ResponseEntity<Product> findById(int productId) {
		Optional<Product> productO=  productServiceImpl.getProductbyId(productId);
		if (!productO.isPresent()) {
			return null;
		}
		return ResponseEntity.ok(productO.get());
	}
	
	@DeleteMapping("/delete/{productId}")
	public void deleteById(int productId) {
		productServiceImpl.deleteById(productId);
	}
	
	@PostMapping("/createProduct")
	public Product createProduct(Product product) {
		product.setProductId(0);
		
		productServiceImpl.saveAll(product);
		
		return product;
		
	}
	@PatchMapping("/updateProduct")
	public void updateProduct(Product product) {
		
		productServiceImpl.saveAll(product);
	}
//	
////	Store section
//	
	@GetMapping("/store")
	public List<Store> find(int storeId) {
		return storeServiceImpl.findAll(storeId);
	}
	
	@GetMapping("/store/{storeId}")
	public ResponseEntity<Store> getById(int storeId) {
		Optional<Store> storeO=  storeServiceImpl.findById(storeId);
		if (!storeO.isPresent()) {
			return null;
		}
		return ResponseEntity.ok(storeO.get());
	}
	
	@DeleteMapping("/delete/{storeId}")
	public void removeById(int storeId) {
		productServiceImpl.deleteById(storeId);
	}
	
	@PostMapping("/createStore")
	public Store createStore(Store store) {
		store.setStoreId(0);
		
		storeServiceImpl.saveAll(store);
		
		return store;
		
	}
	@PatchMapping("/updateStore")
	public void updateStore(Store store) {
		
		storeServiceImpl.saveAll(store);
	}
}
