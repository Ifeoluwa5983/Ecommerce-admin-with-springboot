package com.exercise.admin.Services;

import java.util.List;

import com.exercise.admin.entity.Store;
import java.util.Optional;

public interface StoreService {
	
	public List <Store> findAll(int storeId);
	
	public void deleteById(int storeId);
	
	public Store saveAll(Store store);
	
	public Optional<Store> findById(int storeId);

}
