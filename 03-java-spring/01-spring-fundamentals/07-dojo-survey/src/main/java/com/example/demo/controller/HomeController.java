package com.example.demo.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/result")
	public String result(Model model, HttpSession session, @RequestParam("name") String name,
			@RequestParam("Location") String Location, @RequestParam("Language") String lang,
			@RequestParam("Comment") String comment) {
		/*
		 * session.setAttribute("name",name); session.setAttribute("Location",
		 * Location); session.setAttribute("Language", lang);
		 * session.setAttribute("Comment", comment);
		 */
		model.addAttribute("name", name);
		model.addAttribute("Location", Location);
		model.addAttribute("lang", lang);
		model.addAttribute("Comment", comment);

		if (lang.equals("Java")) {
			return "java.jsp";
		} else {
			return "result.jsp";
		}
	}

}
