package com.exercise.admin.adminDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercise.admin.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
