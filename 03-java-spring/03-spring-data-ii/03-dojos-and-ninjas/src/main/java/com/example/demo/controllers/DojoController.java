package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.models.Dojo;
import com.example.demo.services.DojoServices;

@Controller
public class DojoController {
	
	@Autowired
	DojoServices services;

	@GetMapping("/")
	public String index() {
		return"index.jsp";
	}
	
	@GetMapping("/newDojo")
	public String newDojo(@ModelAttribute("Dojo")Dojo dojo) {
		return"Dojos/newDojo.jsp";
	}
	
	@PostMapping("/newDojo")
	public String createDojo(@Valid @ModelAttribute("Dojo")Dojo dojo,BindingResult result,RedirectAttributes redirect) {
		if(result.hasErrors()) {
			return"Dojos/newDojo.jsp";
		}else {
			services.save(dojo);
			redirect.addAttribute("Dojo",dojo.getId());
			return "redirect:/Dojos/opening.jsp/{Dojo}";
		}
	}
	
	@GetMapping("Dojos/opening.jsp/{Dojo}")
	public
}
