package com.training.springboot.controller;

import java.util.List;

import com.training.springboot.entity.ProductDesign;
import com.training.springboot.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;

	@PostMapping("/addProduct")
	public ProductDesign addProduct(@RequestBody ProductDesign productDesign) {
		return service.saveProduct(productDesign);
	}
	@PostMapping("/addProducts")
	public List<ProductDesign> addProduct(@RequestBody List<ProductDesign> productDesign) {
		return service.saveProducts(productDesign);
	}

	@GetMapping("/addProducts")
	public List<ProductDesign> findAllProduct() {
		return service.getProducts();

	}

	@GetMapping("/product")
	public ProductDesign findProductById(@PathVariable int id) {
		return service.getProductsById(id);
	}
	@PutMapping("/update")
	public ProductDesign updateProduct(@RequestBody ProductDesign productDesign) {
		return service.updateProduct(productDesign);
		
	}
	@DeleteMapping
	public String deleteProduct(int id) {
		return service.deleteProduct(id);
	}
	
	
	
}
