package com.exercise.admin.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercise.admin.adminDAO.StoreRepository;
import com.exercise.admin.entity.Store;

@Service
public class StoreServiceImpl implements StoreService {
	
	@Autowired
	private StoreRepository storeRepo;
	

	@Override
	public List<Store> findAll() {
	
		return storeRepo.findAll();
	}

	@Override
	public void deleteById(int storeId) {
		storeRepo.deleteById(storeId);
		
	}

	@Override
	public Store saveAll(Store store) {
		
		return storeRepo.save(store);
	}

	@Override
	public Optional<Store> findById(int storeId) {
		return storeRepo.findById(storeId);
		
	}

}
