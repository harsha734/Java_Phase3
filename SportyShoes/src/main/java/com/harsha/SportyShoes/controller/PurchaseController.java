package com.harsha.SportyShoes.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.harsha.SportyShoes.entity.GlobalData;
import com.harsha.SportyShoes.entity.Product;
import com.harsha.SportyShoes.entity.Purchase;
import com.harsha.SportyShoes.repo.PurchaseRepository;
import com.harsha.SportyShoes.service.ProductService;
import com.harsha.SportyShoes.repo.UserDetailsRepository;

@Controller
public class PurchaseController {
		
	@Autowired
	ProductService productService;
	
	@Autowired
	UserDetailsRepository userRepository;
	
	@Autowired
	PurchaseRepository purchaseRepository;
	
	@GetMapping("/product/{id}")
	public String addToCart(@PathVariable int id) {
		//GlobalData.cart.addAll(productService.getProductById(id));
		return "redirect:/menu";
	}
	
	@GetMapping("/cart")
	public String cartGet(Model model) {
		model.addAttribute("cartCount" , GlobalData.cart.size());
		model.addAttribute("total" , GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
		model.addAttribute("cart" , GlobalData.cart);
		return "cart";
		
		
	}
	
	@GetMapping("/cart/removeItem/{index}")
	public String cartItemRemove(@PathVariable int index) {
		GlobalData.cart.remove(index);
		return "redirect:/cart";
	}
	
	@GetMapping("/checkout")
	public String checkout(Model model) {
		model.addAttribute("total" , GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
		return "checkout";
	}
	
	@PostMapping("/purchase")
	public String orderConfirmation(Model model) {
		model.addAttribute("total" , GlobalData.cart.stream().mapToDouble(Product::getPrice).sum());
		//Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//String currentPrincipalName = auth.getName();
		
		List<Purchase>purchaseList = new ArrayList<Purchase>();
		//System.out.println(currentPrincipalName);
		//UserDetailsRepository user = userRepository.findUserByEmail().get();
		for(Product product: GlobalData.cart) {
			Purchase purchase = new Purchase();
			//System.out.println(product.getId() + " " + product.getName());
			purchase.setProductId(product.getId());
			//purchase.setUserId(user.getId());
			purchase.setOrderDate(LocalDate.now());
			purchaseList.add(purchase);
		}
		
		int n = 10000 + new Random().nextInt(90000);
		model.addAttribute("Reciept" , n);
		
		model.addAttribute("products" , GlobalData.cart);
		purchaseRepository.saveAll(purchaseList);
		
		return "confirmpurchase";
	}
	
	
}
