package com.example.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class HomeController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		return "index.jsp";
	}
	
	public int count(HttpSession session) {
		
		Integer current =(Integer) session.getAttribute("count");  
		
		current++;
		
		session.setAttribute("count", current);
		return current;
	}
	
	@GetMapping("/counter")
	public String counter(HttpSession sesh,Model model) {
		Integer current =(Integer) sesh.getAttribute("count");
		current++;
		model.addAttribute("count",current);
		return "redirect:/";
	}

}
