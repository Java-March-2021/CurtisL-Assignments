package com.example.demo.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.model.Users;
import com.example.demo.services.UsersService;

@Controller
public class HomeController {

	@Autowired
	UsersService uService;
	
	@GetMapping("/registration")
	public String registrationForm(@ModelAttribute("user")Users user) {
		
		return "registrationPage.jsp";
		
	}
	
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("user")Users user,BindingResult result,
			HttpSession session,RedirectAttributes redirect) {
		if(result.hasErrors()) {
			return"registrationPage.jsp";
		}
		
		uService.registerUser(user);
		session.setAttribute("UserId", user.getId());
		return"redirect:/home";
		
		
	}
	
	@GetMapping("/home")
	public String home(HttpSession session,Model model) {
		Users user = uService.findUserById( (Long)session.getAttribute("UserId"));
		model.addAttribute("user",user);
		return"homePage.jsp";
	}
	
	@GetMapping("/login")
	public String login() {
		return"loginPage";
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestParam("email")String email,
			@RequestParam("password")String password, Model model,HttpSession session) {
		if(uService.authenticateUser(email, password)) {
			Users user = uService.findByEmail(email);
			session.setAttribute("UserId", user.getId());
			return"redirect:/home";
		}
		model.addAttribute("error","Invalid Credentials. Please check email and password");
		return"loginPage.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return"redirect:/login";
	}
}
