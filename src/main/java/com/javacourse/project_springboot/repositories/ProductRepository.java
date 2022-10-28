package com.javacourse.project_springboot.repositories;

import com.javacourse.project_springboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
