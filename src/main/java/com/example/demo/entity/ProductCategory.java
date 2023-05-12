package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class ProductCategory {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productCategoryId;	
	private String productCategoryName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "productcategory")
	List<Product> product=new ArrayList<Product>();

	public ProductCategory() {
		super();
		
	}

	public ProductCategory(int productCategoryId, String productCategoryName, List<Product> product) {
		super();
		this.productCategoryId = productCategoryId;
		this.productCategoryName = productCategoryName;
		this.product = product;
	}

	public int getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductCategory [productCategoryId=" + productCategoryId + ", productCategoryName="
				+ productCategoryName + ", product=" + product + "]";
	}

	

}
