package com.shopsy.main.Service;

import java.util.List;

 
import java.util.Map;

import com.shopsy.main.entity.Product;

public interface ProductService {

	
	//insert/save operation
	public String AddProduct(Product product);

	// select/show operation
	public List<Product> getAllProduct();

	// select/show single record
	public Product getSingleDetails(Long productId);

	// update details
	public String modifyProductDetails(Product product);

	// delete product
	public String deleteProduct(Long productId);

	// dropdown list
	public Map<Long, String> getAllProductsCategory();

	// use this method to changeTravelPlanStaus
	public String changeProductAvailableStatus(Long productID, String Status);

}
