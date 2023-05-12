package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Cart;

public interface CartDeclarations {

	
	public List<Cart> displayAllCarts();
	public Cart displayByCartId(int id);
	public void insertionorupdation(Cart cart);
	public void deletion(int id);
}
