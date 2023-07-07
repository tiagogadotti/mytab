package com.mytab.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytab.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
