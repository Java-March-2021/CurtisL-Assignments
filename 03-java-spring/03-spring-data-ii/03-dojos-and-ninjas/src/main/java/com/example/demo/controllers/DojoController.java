package com.example.demo.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.models.Dojo;
import com.example.demo.models.Ninja;
import com.example.demo.services.DojoServices;

@Controller
public class DojoController {

	@Autowired
	DojoServices services;

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}

	@GetMapping("/newDojo")
	public String newDojo(@ModelAttribute("Dojo") Dojo dojo) {
		return "Dojos/newDojo.jsp";
	}

	@PostMapping("/newDojo")
	public String createDojo(@Valid @ModelAttribute("Dojo") Dojo dojo, BindingResult result,
			RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "Dojos/newDojo.jsp";
		} else {
			services.save(dojo);
			redirect.addAttribute("id", dojo.getId());
			return "redirect:/Dojos/opening.jsp/{id}";
		}
	}

	@GetMapping("Dojos/opening.jsp/{id}")
	public String opening(@PathVariable("id") Long id, Model model) {
		Dojo dojo = services.findById(id).orElse(null);
		model.addAttribute("dojo", dojo);
		return "Dojos/opening.jsp";
	}

	@GetMapping("/newNinja")
	public String newNinja(@ModelAttribute("Ninja") Ninja ninja, Model model) {

		Iterable<Dojo> dojos = services.findAll();
		model.addAttribute("dojos", dojos);
		return "Ninjas/newNinja.jsp";

	}

	@PostMapping("/NewNinja")
	public String createNinja(@Valid @ModelAttribute("Ninja") Ninja ninja, BindingResult result,
			RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "Ninjas/newNinja.jsp";
		}
		services.save(ninja);
		redirect.addAttribute("id", ninja.getId());
		return "redirect:Ninjas/ninja/{id}";
	}

	@GetMapping("Ninjas/ninja/{id}")
	public String ninja(@PathVariable("id") Long id, Model model) {
		Ninja ninja = services.findNinja(id).orElse(null);
		Dojo dojo = ninja.getDojo();

		model.addAttribute("ninja", ninja);
		model.addAttribute("dojo", dojo);
		return "Ninjas/ninja.jsp";
	}

	@GetMapping("/dojoList")
	public String allDojos(Model model) {
		Iterable<Dojo> dojos = services.findAll();
		HashMap<String, Long> counts = new HashMap<String, Long>();
		for (Dojo d : dojos) {
			counts.put(d.getName(), services.countNinjas(d));

		}
		model.addAttribute("dojos", dojos);
		model.addAttribute("count", counts);
		return "Dojos/dojos.jsp";
	}

	@GetMapping("dojo/{id}")
	public String dojoData(@PathVariable("id") Long id, Model model) {
		Dojo dojo = services.findById(id).orElse(null);
		List<Ninja> ninjas = services.findAllByDojo(dojo);
		model.addAttribute("dojo", dojo);
		model.addAttribute("ninjas",ninjas);
		return "Dojos/dojo.jsp";
	}
}
