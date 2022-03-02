package com.harsha.SportyShoes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsha.SportyShoes.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
