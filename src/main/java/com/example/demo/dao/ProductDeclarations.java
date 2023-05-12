package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductDeclarations {

	public List<Product> displayAll();
	public Product displayById(int id);
	public void insertionorupdation(Product pro);
	public void deletion(int id);
	public List<Product> findAllByProductCategoryId(int productCategoryId);
}
