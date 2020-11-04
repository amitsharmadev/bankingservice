package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	List<Product> prods=new ArrayList<Product>();
	@PostConstruct
	public void fillData() {
		prods.add(new Product(101, "Printer"));
		prods.add(new Product(102, "SCANNER"));
		prods.add(new Product(103, "Keyboard"));
		
	}
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return prods;
	}

}
