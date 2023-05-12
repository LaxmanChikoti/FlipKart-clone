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
import com.example.demo.dao.CartDao;
import com.example.demo.dao.CartRepositary;
import com.example.demo.entity.Cart;

@RestController
@RequestMapping("/cart")
@CrossOrigin("http://localhost:4200")
public class CartController {

	
	private CartDao cartdao;
	private CartRepositary cartrepositary;
	
	
	@Autowired
	public CartController(CartDao cartdao, CartRepositary cartrepositary) {
		super();
		this.cartdao = cartdao;
		this.cartrepositary = cartrepositary;
	}
	@GetMapping("/list")
	   public List<Cart> displayData(){
			
			List<Cart> cart = cartdao.displayAll();
			return cart;
		}
	   @GetMapping("/cartuserId/{userId}")
	   public List<Cart> userCartData(@PathVariable("userId") int id) {
		   return cartrepositary.findAllByUserId(id);
	   }
		@GetMapping("/list/{cartId}")
		public Cart getDatabyId(@PathVariable("cartId") int id) {
			Cart cart = cartdao.displayById(id);
			if(cart==null)
				throw new RuntimeException("id not found");
				return cart;
				
		}
		@PostMapping("/list")
		public void inorup (@RequestBody Cart cart) {
			cart.setCartId(0);
			cartdao.insertionorupdation(cart);
			
		}
		
		
		@PutMapping	("/list")	
		public void modify(@RequestBody Cart cart )
	    {
			cartdao.insertionorupdation(cart);
	    }
		
		
		@DeleteMapping("/list/{id}")
		public void delete(@PathVariable int id)
		    {
			
		    	cartdao.deletion(id);
		    	
		    	
		    }
		@GetMapping("/cartcount/{userId}")
		public int getCOunt(@PathVariable int userId) {
			return cartrepositary.getCount(userId);
		}
	
}
