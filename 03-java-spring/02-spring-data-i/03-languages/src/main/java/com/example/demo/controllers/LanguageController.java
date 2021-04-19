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

import com.example.demo.models.Language;
import com.example.demo.services.LanguageServices;

@Controller
public class LanguageController {

	@Autowired
	LanguageServices lservice;

	@GetMapping("/languages")
	public String index(Model model, @Valid @ModelAttribute("lang") Language lang, BindingResult result) {
		List<Language> langs = lservice.findAll();
		model.addAttribute("langs", langs);
		return "languages.jsp";
	}

	@PostMapping("/languages")
	public String create(@Valid @ModelAttribute("lang") Language lang, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Language> langs = lservice.findAll();
			model.addAttribute("langs", langs);
			return "languages.jsp";
		}
		lservice.createLanguage(lang);
		return "redirect:/languages";
	}

	@GetMapping("/languages/{id}")
	public String getLang(Model model, @PathVariable("id") Long id) {
		Language lang = lservice.findById(id).orElse(null);
		model.addAttribute("lang", lang);
		return "show.jsp";

	}

	@GetMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language lang = lservice.findById(id).orElse(null);
		model.addAttribute("lang", lang);
		return "edit.jsp";
	}

	@PostMapping("/languages/{id}/edit")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("lang") Language lang,
			BindingResult result) {
		if (result.hasErrors()) {

			return "edit.jsp";
		}
		lservice.updateLanguage(lang);
		return "redirect:/languages";

	}

	@GetMapping("/languages/{id}/delete")
	public String delete(@PathVariable("id") Long id, Model model) {
		Language lang = lservice.findById(id).orElse(null);
		model.addAttribute("lang", lang);
		return "delete.jsp";
	}

	@PostMapping("/destroy/{id}")
	public String destroy(@PathVariable("id") Long id) {

		lservice.deleteById(id);
		return "redirect:/languages";
	}
}
