package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	UserDao userdao;
	
	@GetMapping("displayAllUsers")
	public List<User> displayAllUsers(){
		
		return userdao.getAllUsers();
	}
	
	@DeleteMapping("deleteuser/{uId}")
	public void deleteUser(@PathVariable("uId") int userId) {
		userdao.delete(userId);
	}
	
	@PutMapping("updateUser")
	public void updateUser(@RequestBody User user) {
		userdao.update(user);
	}
	
	@PostMapping("/registerUser")
	public void registerUser(@RequestBody User user){
		System.out.println("Data Reciedved" + user);
		userdao.register(user);
		
		
	}
	
}
