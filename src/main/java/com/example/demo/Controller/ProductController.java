package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dao.ProductDao;

import com.example.demo.entity.Product;

@RestController
@RequestMapping("/product")
@CrossOrigin("http://localhost:4200")
public class ProductController {

	@Autowired
	ProductDao productdao;
	
	public ProductController(ProductDao productdao) {
		this.productdao= productdao;
	}
	
	@GetMapping("/list")
	public List<Product> displayAllProducts(){
		List<Product> product = productdao.getAllProducts();
		return product;
	}
	
	@GetMapping("/list/{productId}")
	public Product getDataById(@PathVariable("productId") int id) {
		Product product = productdao.displayById(id);
		if(product == null)
			throw new RuntimeException("id not found");
		return product;
	}
	
	@PostMapping("/list")
	public void insOrUpd(@RequestBody Product pro) {
		pro.setProductId(0);
		System.out.println(pro);
		productdao.insertionorupdation(pro);
	}
	
	@PutMapping("/list")
	public void modify(@RequestBody Product pro) {
		productdao.insertionorupdation(pro);
	}
	
	
	
	@DeleteMapping("/list/{productId}")
	public List<Product> deleteProduct(@PathVariable("productId") int id) {
		
		Product product = productdao.displayById(id);
	if(product == null)
		throw new RuntimeException("id not found to delete");
	
		productdao.deletion(id);
		return displayAllProducts();
	
		
	}
	
	@GetMapping("/search/{productCategoryId}")
	public List<Product> search(@PathVariable String productCategoryId){
		int cartId = Integer.parseInt(productCategoryId);
		return productdao.search(cartId);
		
	}
	
	@GetMapping("/searchh/{val}")
	public List<Product> searchh(@PathVariable String val){
		
		List<Product> product = productdao.getAllProducts();
		List<Product> res = new ArrayList<Product>();
		for(Product p : product) {
			if(p.getProductName().contains(val)) {
				res.add(p);
			}
		}
		return res;
		
	}
	

	
}
