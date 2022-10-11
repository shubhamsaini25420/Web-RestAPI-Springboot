package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product getProductById(Object object);

	Product findByName(String name);

}
