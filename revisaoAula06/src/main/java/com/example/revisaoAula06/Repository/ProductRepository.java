package com.example.revisaoAula06.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.revisaoAula06.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
