package com.vendi.productcatalogservice.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;




@Entity
public class Product {

	//The @Id annotation is part of the Java Persistence API (JPA), which is used to specify the primary key of an entity in Spring Boot applications. To use @Id, you need to include the JPA dependency in your project.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private Double price;
    private Integer stockQuantity;
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable=false)
    private Category category;

    private Double rating;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
