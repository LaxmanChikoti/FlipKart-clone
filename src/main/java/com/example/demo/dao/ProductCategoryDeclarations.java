package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.ProductCategory;

public interface ProductCategoryDeclarations {

	public List<ProductCategory> getAllCategories();
	public ProductCategory displayBypcId(int id);
	public void insertionorupdation(ProductCategory productcategory);
	public void deletion(int id);
}
