package com.example.revisaoAula06.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.revisaoAula06.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
