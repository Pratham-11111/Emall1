package com.shopsy.main.Util;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;



import com.shopsy.main.Dao.ProductDAO;
import com.shopsy.main.Exception.productException;
import com.shopsy.main.entity.Product;

public class Validation
{
	@Autowired
	ProductDAO productDAO;
	
	public void validateProduct(Product product) {

		// Field validation
		validateProductfield(product);

		// valid emailId & PhoneNumber format

		// User existence validation for email, phone number, and user ID
		//validateProductExixtanse(product);
	}
		private void validateProductfield(Product product) {
			if (isBlank(product.getProductName())) {
				throw new productException("First Name is required");
			}
		}

		
		private boolean isBlank(String value) {
			return value == null || value.trim().isEmpty();
		}
	}

