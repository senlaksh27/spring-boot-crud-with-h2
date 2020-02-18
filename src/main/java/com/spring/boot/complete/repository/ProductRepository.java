package com.spring.boot.complete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.complete.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
