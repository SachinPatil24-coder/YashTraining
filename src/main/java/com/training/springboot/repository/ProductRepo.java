package com.training.springboot.repository;

import com.training.springboot.entity.ProductDesign;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductDesign, Integer>{

}
