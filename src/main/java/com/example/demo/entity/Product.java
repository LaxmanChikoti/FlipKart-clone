package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Product {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;	
	private String productName;	
	private int productCategoryId;
	private String productImage;
	private String productPrice;
	private String productDescription;
	private int productQuantity;
		
	@ManyToOne(targetEntity= ProductCategory.class,fetch=FetchType.EAGER)
	@JoinColumn(name="productCategoryId",insertable=false,updatable=false)
	ProductCategory productcategory;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Product(int productId, String productName, int productCategoryId, String productImage, String productPrice,
			String productDescription, int productQuantity, ProductCategory productcategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategoryId = productCategoryId;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.productQuantity = productQuantity;
		this.productcategory = productcategory;
	}



	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public ProductCategory getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(ProductCategory productcategory) {
		this.productcategory = productcategory;
	}



	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategoryId="
				+ productCategoryId + ", productImage=" + productImage + ", productPrice=" + productPrice
				+ ", productDescription=" + productDescription + ", productQuantity=" + productQuantity
				+ ", productcategory=" + productcategory + "]";
	}



	}
	
//	@ManyToOne(targetEntity=ProductCategory.class, fetch=FetchType.EAGER)
//	@JoinColumn(name="productCategoryId", insertable=false, updatable=false)
//	 ProductCategory productcategory;

	


