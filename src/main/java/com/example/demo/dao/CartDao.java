package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;


@Service
public class CartDao {
	
	@Autowired
	CartRepositary cartrepos;
	
	public CartDao(CartRepositary cartrepos) {
		this.cartrepos = cartrepos;
	}
	@Transactional
	public List<Cart>displayAll(){
		return cartrepos.findAll();
	}
	@Transactional
	public Cart displayById(int id) {
		return cartrepos.findById(id).get();
	}
	@Transactional
	public void insertionorupdation(Cart cart) {
		cartrepos.save(cart);
	}
	@Transactional
		public void deletion(int id) {
			cartrepos.deleteById(id);
		
	}

}
