package com.vendi.productcatalogservice.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendi.productcatalogservice.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Optional<Category> findByName(String name);
}
