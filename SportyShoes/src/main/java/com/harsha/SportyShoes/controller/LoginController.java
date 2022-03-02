package com.harsha.SportyShoes.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.harsha.SportyShoes.entity.Login;
import com.harsha.SportyShoes.service.LoginService;


@Controller
public class LoginController {

	@Autowired
	private LoginService ls;

	@GetMapping("/")
	public ModelAndView login() {
		
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("user", new Login());
		return mav;
	}

	@PostMapping("/adminlogin")
	public String signUp(@ModelAttribute("user") Login user ) {
		Login oauthUser = null;
		System.out.println("from login"+ user);
		
		if(user.getPassword() != "" ) {
			System.out.println("logging in");	
			oauthUser = ls.signgin(user.getUsername(), user.getPassword());
			return "menu";
		} else {
			if (user.getNewPassword() != "" ) {
				System.out.println("Changing new password");
				oauthUser = ls.changePassword(user.getUsername(), user.getNewPassword());
				if(oauthUser == null ) {
					return "wrongpassword";	
				}
				return "menu";
			}
			return "wrongpassword";	
		} 
	}
	@RequestMapping("/logout")
	public String logoutDo()
	{
		return "logout";
	}


}

