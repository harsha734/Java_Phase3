package com.harsha.SportyShoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsha.SportyShoes.entity.Purchase;
import com.harsha.SportyShoes.repo.PurchaseRepository;

@Service
public class PurchaseService {

@Autowired
PurchaseRepository purchaseRepository;
	
public List<Purchase> getAllPurchases(){
		
		return purchaseRepository.findAll();
		
	}

}