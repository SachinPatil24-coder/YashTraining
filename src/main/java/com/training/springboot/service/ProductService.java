package com.training.springboot.service;

import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

import com.training.springboot.entity.ProductDesign;
import com.training.springboot.repository.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;

	public ProductDesign saveProduct(ProductDesign productDesign) {
		return repo.save(productDesign);

	}

	public List<ProductDesign> saveProducts(List<ProductDesign> productDesigns) {
		return repo.saveAll(productDesigns);

	}

	public List<ProductDesign> getProducts() {
		return repo.findAll();
	}

	public ProductDesign getProductsById(int id) {

		return repo.findById(id).orElse(null);
	}

	public String deleteProduct(int id) {
		repo.deleteById(id);
		return null;

	}

	public ProductDesign updateProduct(ProductDesign productDesign) {
		ProductDesign design = repo.findById(productDesign.getId()).orElse(null);
		design.setName(null);
		design.setQuantity(0);
		design.setPrice(0);
		return repo.save(design);

	}
}
