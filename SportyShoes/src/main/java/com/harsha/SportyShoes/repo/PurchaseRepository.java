package com.harsha.SportyShoes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsha.SportyShoes.entity.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

}