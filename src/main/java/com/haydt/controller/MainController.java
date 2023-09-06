package com.haydt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haydt.bean.Product;
import com.haydt.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class MainController {
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/product")
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
}
