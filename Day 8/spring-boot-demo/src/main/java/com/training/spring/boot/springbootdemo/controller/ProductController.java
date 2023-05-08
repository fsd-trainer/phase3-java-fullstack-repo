package com.training.spring.boot.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.boot.springbootdemo.model.Product;
import com.training.spring.boot.springbootdemo.service.ProductService;

// define the class as REST API
// Every method of REstController class will be annotated with @ResponseBody to generate the response

@RestController
@RequestMapping("/api/v1") // common url for all methods
public class ProductController {

	// property
	private ProductService service;

	// tight coupling
	/*public ProductController() {
		this.service = new ProductService();
	}*/

	// loosely coupled code
	  @Autowired 
	  public ProductController(ProductService service) {
		  this.service =  service; }
	 

	// URL: http://localhost:8090/api/v1/products
	@RequestMapping(value="/products", method = RequestMethod.GET)
	public List<Product> sendProducts() {
		List<Product> productsList = this.service.getAllProducts();
		return productsList;
	}

	// @RequestBody annotation read json object from the HTTP message body, create the corresponding object on the server
	// and store values from JSON to object
	// rest api standard - a post method should return newly added object to the client
	@RequestMapping(value="/add/product", method = RequestMethod.POST)
	public Product addProduct(@RequestBody Product product ) {
	   // send the product object to the productService where it will be stored in the list
		this.service.addProduct(product);
		return product;
	}
}
