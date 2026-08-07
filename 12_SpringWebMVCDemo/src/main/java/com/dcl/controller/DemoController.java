package com.dcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dcl.entity.User;
import com.dcl.service.UserService;


@Controller
@RequestMapping("/user")
public class DemoController {
	
	@Autowired
	private UserService uservice;
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("user",new User());
		return "addUser";
	}
	
	@PostMapping("/save")
	public String addUser(@ModelAttribute User user, Model model) {
		User u=uservice.addUser(user);
		model.addAttribute("success", "Data add Successfully! User ID -"+u.getUserId());
		return "addUser";
	}
}
