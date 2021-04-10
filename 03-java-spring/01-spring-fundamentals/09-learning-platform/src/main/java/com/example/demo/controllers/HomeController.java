package com.example.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/m/{chapter}/0483/{assignment#}")
	public String assignment(@PathVariable String chapter,@PathVariable String assignment,HttpSession sesh) {
		if(sesh.getAttribute("count")==null) {\
			sesh.setAttribute("count", 1);
		return "index.jsp";
		}
		if ()
	}

}
