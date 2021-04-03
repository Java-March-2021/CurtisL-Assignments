package com.example.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller	
public class HomeController {
	
	HttpSession session;
	
	@RequestMapping("")
	public String index(HttpSession session) {
		int iterate = 1;
		if(session.getAttribute("count")==null) {	
			session.setAttribute("count", 1);
			
		} else {
			iterate+= (Integer) session.getAttribute("count");
			session.setAttribute("count", iterate);
		}
		return "index.jsp";
	}

	
	
	@RequestMapping("/counter")
	public String counter(HttpSession session,Model model) {
		model.addAttribute("count",session.getAttribute("count"));
		return"counter.jsp";
	}
	
	

}
