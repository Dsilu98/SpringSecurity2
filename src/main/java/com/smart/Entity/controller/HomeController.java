package com.smart.Entity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.Entity.User;
import com.smart.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
	//Handle GET requests to the home page
	@GetMapping("")
	
	public String home(Model model) {
		model.addAttribute("title","Home-Smart Contact Manager");
		return "home";
	}
	@GetMapping("/about")
	public String about(Model model) {
		return "about";
	}
	
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
	
}
