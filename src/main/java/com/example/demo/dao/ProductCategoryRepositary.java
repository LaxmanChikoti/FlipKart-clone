package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.ProductCategory;

@CrossOrigin("http://localhost:4200")
public interface ProductCategoryRepositary extends JpaRepository<ProductCategory, Integer> {

}
