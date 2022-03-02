package com.harsha.SportyShoes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsha.SportyShoes.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
