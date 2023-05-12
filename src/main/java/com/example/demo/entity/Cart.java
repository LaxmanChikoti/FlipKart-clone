package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
	@Column(name="cartId")
	private int cartId;
	
	@Column(name="productId")
	private int productId;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="productImage")
	private String productImage;
	
	@Column(name="productPrice")
	private String productPrice;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="productQuantity")
	private String productQuantity;
	
	
	@OneToOne(targetEntity=Product.class)
	@JoinColumn(name="productId",insertable=false,updatable=false)
	private Product product;
	
	@OneToOne(targetEntity=User.class)
	@JoinColumn(name="userId",insertable=false,updatable=false)
	private User user;
	
	public Cart() {
		
	}

	public Cart(int cartId, int productId, int userId, String productImage, String productPrice, String productName, String productQuantity,
			Product product, User user) {
		super();
		this.cartId = cartId;
		this.productId = productId;
		this.userId = userId;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.productName= productName;
		this.productQuantity = productQuantity;
		this.product = product;
		this.user = user;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
	

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", productId=" + productId + ", userId=" + userId + ", productImage="
				+ productImage + ", productPrice=" + productPrice + ", productName=" + productName
				+ ", productQuantity=" + productQuantity + ", product=" + product + ", user=" + user + "]";
	}

	
	
}
