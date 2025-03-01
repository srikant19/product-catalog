package com.vendi.productcatalogservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendi.productcatalogservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
    List<Product> findByCategoryName(String categoryName);
    List<Product> findByNameContaining(String keyword);

}
