package com.shopsy.main;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.shopsy.main.Dao.ProductDAO;
import com.shopsy.main.Service.ProductService;
import com.shopsy.main.Service.productimpl;
import com.shopsy.main.entity.Product;

@SpringBootApplication
public class Emall1Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Emall1Application.class, args);

		ProductDAO productDAO=applicationContext.getBean(ProductDAO.class,"ProductDAO");
		Product product=new Product();
		product.setProductName("Iphone15");
		product.setDescription("5G");
		product.setDiscountPrice(20000d);

		product.setPrice(23000d);
		product.setAvailableStatus("in stock");
		product.setQuantity(1);
		product.setCreatedBy("pratham");
		product.setCreated_date(LocalDateTime.now());
		product.setUpdatedBy("kauu");
		product.setUpdated_date(LocalDateTime.now());;
		
		productDAO.save(product);
//		
		//productDAO.deleteAll();
		
//		ProductService productService= applicationContext.getBean(ProductService.class,"ProductService");
//		Product product=new Product();
//		product.setProductName("sony");
//		product.setDescription("4g");
//		product.setDiscountPrice(12000.20);
//		product.setPrice(14000.50);
//		product.setAvailableStatus("in stock");
//		product.setQuantity(8);
//		product.setCreatedBy("pratham");
//		product.setCreatedDate(LocalDate.now());
//		product.setUpdatedBy("sammu");
//		product.setUpdatedDate(LocalDate.now());
//		String res=productService.AddProduct(product);
//		System.out.println(res);
	}
}