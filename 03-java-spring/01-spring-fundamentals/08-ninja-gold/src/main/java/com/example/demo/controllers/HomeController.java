package com.example.demo.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String startGold(HttpSession sesh, Model model) {
		if (sesh.getAttribute("gold") == null) {
			sesh.setAttribute("gold", 50);
		}
		ArrayList<String> activity = new ArrayList<String>();
		if (sesh.getAttribute("activity") == null) {
			sesh.setAttribute("activity", activity);
		}

		model.addAttribute("activity", sesh.getAttribute("activity"));
		return "Gold.jsp";
	}

	@PostMapping("/findGold")
	public String findGold(Model model, HttpSession sesh, @RequestParam("building") String name) {
		Random rand = new Random();
		int gold = 0;
		int totalgold = (int) sesh.getAttribute("gold");
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d uuuu h:mm a");

		String text = date.format(format);
		@SuppressWarnings("unchecked")
		ArrayList<String> activity = (ArrayList<String>) sesh.getAttribute("activity");

		model.addAttribute("name", sesh.getAttribute("gold"));
		if (name.equals("Farm")) {
			gold = rand.nextInt(20 - 10 + 1) + 10;
			activity.add("You entered a " + name + " and earned " + gold + ". (" + text + ")");
		} else if (name.equals("Cave")) {
			gold = rand.nextInt(10 - 5 + 1) + 5;
			activity.add("You entered a " + name + " and earned " + gold + ". (" + text + ")");
		} else if (name.equals("House")) {
			gold = rand.nextInt(5 - 2 + 1) + 2;
			activity.add("You entered a " + name + " and earned " + gold + ". (" + text + ")");
		} else if (name.equals("Casino")) {

			gold = rand.nextInt(50 + 50 - 1) - 50;
			if (gold < 0) {
				activity.add("You entered a " + name + " and loss " + gold + ". (" + text + ")");
			} else
				activity.add("You entered a " + name + " and won " + gold + ". (" + text + ")");
		}

		totalgold += gold;
		sesh.setAttribute("gold", totalgold);
		model.addAttribute("newgold", gold);
		model.addAttribute("date", text);
		sesh.setAttribute("activity", activity);
		model.addAttribute("activity", sesh.getAttribute("activity"));
		return "redirect:/";

	}
}
