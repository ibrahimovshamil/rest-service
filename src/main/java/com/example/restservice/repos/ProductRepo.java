package com.example.restservice.repos;

import com.example.restservice.entities.AgriUser;
import com.example.restservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo  extends JpaRepository<Product, Integer> {
}
