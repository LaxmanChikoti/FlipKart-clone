package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.demo.entity.Product;


@CrossOrigin("http://localhost:4200")
public interface ProductRepositary extends JpaRepository<Product, Integer> {

	
	
	public List<Product> findAllByProductCategoryId(int productCategoryId);

	
}
