package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;

@Service
public class ProductDao {
	
	@Autowired
	ProductRepositary productrepos;
	
	public ProductDao(ProductRepositary productrepos) {
		this.productrepos=productrepos;
	}
	
	@Transactional
	public List<Product> getAllProducts(){
		return productrepos.findAll();
	}
	@Transactional
	public List<Product> search(int productCategoryId){
		return productrepos.findAllByProductCategoryId(productCategoryId);
		
	}
	@Transactional
	public Product displayById(int id) {
		return productrepos.findById(id).get();
	}
	@Transactional
	public void insertionorupdation(Product pro) {
		productrepos.save(pro);
	}
	@Transactional
		public void deletion(int id) {
			productrepos.deleteById(id);
		
	}
	
	

}
