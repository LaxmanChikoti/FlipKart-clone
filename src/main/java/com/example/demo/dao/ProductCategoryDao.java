package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProductCategory;


@Service
public class ProductCategoryDao {

	@Autowired
	ProductCategoryRepositary productcaterepos;
	
	
	public ProductCategoryDao (ProductCategoryRepositary productcaterepos) {
		this.productcaterepos = productcaterepos;
	}
	@Transactional
	public List<ProductCategory>displayAll(){
		return productcaterepos.findAll();
	}
	@Transactional
	public ProductCategory displayById(int id) {
		return productcaterepos.findById(id).get();
	}
	@Transactional
	public void insertionorupdation(ProductCategory productcategory) {
		productcaterepos.save(productcategory);
	}
	@Transactional
		public void deletion(int id) {
			productcaterepos.deleteById(id);
		
	}

}











//public List<ProductCategory> getAllCategories(){
//	return productcaterepos.findAll();
//}
//
//public void register(ProductCategory productcategory) {
//	productcaterepos.save(productcategory);
//}
//
//
//public void delete(int productCategoryId) {
//
//	productcaterepos.deleteById(productCategoryId);
//
//}
//public void update(ProductCategory productcategory) {
//	productcaterepos.save(productcategory);
//}