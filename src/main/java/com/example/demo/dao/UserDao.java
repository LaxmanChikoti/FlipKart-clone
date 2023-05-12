package com.example.demo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;

@Service
public class UserDao {

	@Autowired//dependency Injection
	UserRepositary userrepos;
	
	public List<User> getAllUsers(){
		return userrepos.findAll();
	}
	
	public void register(User user) {
		userrepos.save(user);
	}
	 
	public void delete(int userId) {
		userrepos.deleteById(userId);
	}
	
	public void update(User user) {
		userrepos.save(user);
	}
}
