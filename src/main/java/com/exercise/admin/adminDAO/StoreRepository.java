package com.exercise.admin.adminDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercise.admin.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {

}
