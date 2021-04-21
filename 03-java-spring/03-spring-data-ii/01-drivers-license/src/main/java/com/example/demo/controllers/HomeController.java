package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.models.License;
import com.example.demo.models.Person;
import com.example.demo.services.PersonService;

@Controller
public class HomeController {
	
	@Autowired
	PersonService pService;
	
	
	
	@GetMapping("/new")
	public String newUser(@ModelAttribute("person")Person person) {
		
		return"person/newPerson.jsp";
	}
	
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("person")Person person,BindingResult result,RedirectAttributes redirect) {
		if(result.hasErrors()) {
			return"person/newPerson.jsp";
		}
		
		pService.save(person);
		redirect.addAttribute("person_id",person.getId());
		return"redirect:/display/{person_id}";
	}
	
	@GetMapping("/license")
	public String newlicense(@ModelAttribute("license")License license,Model model) {
		List<Person> persons = pService.Unlicensed();
		model.addAttribute("persons",persons);
		model.addAttribute("license",license);
		return"license/newlicense.jsp";
	}
	
	@PostMapping("/licensing")
	public String createLicense(@Valid @ModelAttribute("license")License license,BindingResult result,RedirectAttributes redirect,@RequestParam("person")Person person) {
		if(result.hasErrors()) {
			return"license/newlicense.jsp";
		}
		pService.createLicense(license);
		
		
		redirect.addAttribute("person",person.getId());
		
		return"redirect:/credentials/{person}";
	}
	
	@GetMapping("/display/{id}")
	public String display(Model model,@PathVariable("id")Long id) {
		Person person = pService.findById(id).orElse(null);
		model.addAttribute("person",person);
		return"person/display.jsp";
	}
	
	@GetMapping("/credentials/{id}")
	public String showLicense(Model model,@PathVariable("id")Long id) {
		
		Person person = pService.findById(id).orElse(null);
				model.addAttribute("person",person);
		return"credential.jsp";
	}
	
	@GetMapping("/delete")
	public String delete(Model model) {
	Iterable<Person> persons = pService.findAll();
	model.addAttribute("persons",persons);
	return"person/delete.jsp";
	}
	
	
	
	

}
