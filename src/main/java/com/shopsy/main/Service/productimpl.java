package com.shopsy.main.Service;

import java.util.List;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopsy.main.Dao.ProductDAO;
import com.shopsy.main.Util.Validation;
import com.shopsy.main.entity.Product;

@Service
public class productimpl implements ProductService {

	@Autowired(required = true)
	private ProductDAO productDAO;
	
	@Autowired(required = true)
	private Validation validation;

	@Override
	public String AddProduct(Product product) {
		validation.validateProduct(product);
		Product productobj = productDAO.save(product);
		if (productobj != null) {
			return "prodcut id is registered" + +productobj.getProductId();
		}
		return "Id is not registred";
	}

	@Override
	public List<Product> getAllProduct() {

		return productDAO.findAll();

	}

	@Override
	public Product getSingleDetails(Long productId) {

		Optional<Product> product = productDAO.findById(productId);
		if (product.isPresent()) {
			return product.get();
		} else {
			throw new IllegalArgumentException("Product Id not found");
		}
	}

	@Override
	public String modifyProductDetails(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Long, String> getAllProductsCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changeProductAvailableStatus(Long productID, String Status) {
		// TODO Auto-generated method stub
		return null;
	}

}
