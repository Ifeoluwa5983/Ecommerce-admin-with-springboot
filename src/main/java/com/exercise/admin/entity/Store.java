package com.exercise.admin.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Store {
	
	private String storeName;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int storeId;
	
	private String phoneNumber;
	
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="store")
	private List<Product> productList;
	

}
