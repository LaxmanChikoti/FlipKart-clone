package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.Cart;


@CrossOrigin("http://localhost:4200")
public interface CartRepositary extends JpaRepository<Cart, Integer>{

	public List<Cart> findAllByUserId(int userId);
	@Query(value="select count(c) from Cart c where userId=?1 ")
	public int getCount(int userId);
}
