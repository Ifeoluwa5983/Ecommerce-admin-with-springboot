package com.exercise.admin.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	private int productId;
	
	private String productName;
	
	private String price;
	
	private String productDescription;
	
	private String image;
	
	private int categoryId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "store")
	private Store store;

}
