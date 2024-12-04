package com.shopsy.main.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopsy.main.Dao.ProductDAO;
import com.shopsy.main.Service.ProductService;
import com.shopsy.main.entity.Product;

@RestController
@RequestMapping("/Product/api")
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public ResponseEntity<String> addProduct(@RequestBody Product product)
	{
		String PrductRes=productService.AddProduct(product);
		return new ResponseEntity<String>(PrductRes,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/getAllProduct")
	public ResponseEntity<List<Product>> showAllProductDetails()
	{
		List<Product> ListProductdetails=productService.getAllProduct();
		return new ResponseEntity<List<Product>>( ListProductdetails,HttpStatus.OK);
		
	}
	

	@GetMapping("getSingleProduct/{productId}")
	public ResponseEntity<?> showSingleProductdata(@PathVariable Long productId)
	{
		
		try
		{
			Product product=productService.getSingleDetails(productId);
			return new ResponseEntity<Product>(product,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
					
		}
	}
	
	@PutMapping("edit-Product-details/{productId}")
	public ResponseEntity<?> updateProductdetails(@RequestBody Product product)
	{
		return null;
		
	}
	
	@DeleteMapping("delete-Product/{ID}")
	public ResponseEntity<?> deleteProduct(@PathVariable  Long product_Id)
	{
		return null;
		
	}
	
}