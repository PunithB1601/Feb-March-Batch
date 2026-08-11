package com.dcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dcl.entity.User;
import com.dcl.service.UserService;


@Controller
@RequestMapping("/user")
public class DemoController {
	
	
	
	
	@Autowired
	private UserService uservice;
	
	@GetMapping("/demo")
	@ResponseBody
	public String demo(@RequestParam String name, String marks) {
		return name+" is having highest marks! i.e, "+marks;
	}
	
	@GetMapping("/handsome/{name}/demo1")
	@ResponseBody
	public String pathParamDemo(@PathVariable String name) {
		return "The most handsome student in DCL is "+name;
	}
	
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
	
	@GetMapping("/getAll")
	public String getAllUser(Model model) {
		List<User> userList=uservice.getAllUser();
		model.addAttribute("userList",userList);
		return "viewUsers";
	}
	
	@GetMapping("/get/{userId}")
	public String getUserById(@PathVariable Integer userId, Model model) {
		User user=uservice.getUserById(userId);
		model.addAttribute("user",user);
		return "update";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute User user, Model model) {
		uservice.updateUser(user);
		model.addAttribute("success","Data updated successfully!");
		return "redirect:/user/getAll";
	}
	
	@GetMapping("/delete/{userId}")
	public String deleteById(@PathVariable Integer userId) {
		uservice.deleteUser(userId);
		return "redirect:/user/getAll";
	}
}
