package com.training.spring.boot.springbootdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training.spring.boot.springbootdemo.model.Product;

// hold the business logic @Component/@Controller/@Service/@Repository

@Service
public class ProductService {
	// Logs
	// properties
	List<Product> productsList;
	
	public ProductService() {
		System.out.println("ProductService Bean created in the spring container");
		productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "Beverages", 140));
		productsList.add(new Product(2,  "Stationery", 400));
		productsList.add(new Product(3, "Wafers", 300));
	}

	public List<Product> getAllProducts(){
		return productsList;
	}
	
	// how to add a new object in the list - add(object)
	public void addProduct(Product product) {
		this.productsList.add(product);
	}
}
