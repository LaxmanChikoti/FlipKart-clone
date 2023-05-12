package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dao.ProductCategoryDao;
import com.example.demo.entity.ProductCategory;

@RestController
@RequestMapping("/productcategory")
@CrossOrigin("http://localhost:4200")
public class ProductCategoryController {

	@Autowired
	ProductCategoryDao productcategorydao;
	
	public ProductCategoryController(ProductCategoryDao productcategorydao) {
	
		this.productcategorydao = productcategorydao;
	}
	
	@GetMapping("/list")
	public List<ProductCategory> displayAllCategories(){
		
		return productcategorydao.displayAll();
	}
	
	@GetMapping("/list/{productCategoryId}")
	public ProductCategory getDatabyId(@PathVariable("productCategoryId") int id) {
		ProductCategory productcategory = productcategorydao.displayById(id);
		if(productcategory==null)
			throw new RuntimeException("id not found");
			return productcategory;
			
	}
	@PostMapping("/list")
	public void inorup (@RequestBody ProductCategory productcategory) {
		productcategory.setProductCategoryId(0);
		System.out.println(productcategory);
		productcategorydao.insertionorupdation(productcategory);
		
	}
	@PutMapping	("/list")	
	public void modify(@RequestBody ProductCategory productcategory )
	{
		productcategorydao.insertionorupdation(productcategory);
	}
	@DeleteMapping("/list/{productCategoryId}")
	 public String delete(@PathVariable("productCategoryId") int productCategoryId)
	    {
		ProductCategory productcategory=productcategorydao.displayById(productCategoryId);
	    	if(productcategory==null) 
	    		throw new RuntimeException("id not found to delete" +productCategoryId);
	    	productcategorydao.deletion(productCategoryId);
	    	return "Deleted Successfully";
	    	
	    }
	
}
