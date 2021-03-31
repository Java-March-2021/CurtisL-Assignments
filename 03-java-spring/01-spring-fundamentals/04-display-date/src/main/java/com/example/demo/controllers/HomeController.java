package com.example.demo.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	Date date = new Date();
	
	@RequestMapping("/")
	public String index(Model model) {	//you need Model to transfer date to jsp file. 
		Date date = new Date();
		model.addAttribute("date",date);
		return "index.jsp";
	}

	//@PathVariable("var")String var
	
	@RequestMapping("/{var}")
	public String dateOrTime(@PathVariable("var")String day,Model model) {
		Date date = new Date();
		
		if (day.equals("date")) {
			
			model.addAttribute("date",date);
			SimpleDateFormat sm = new SimpleDateFormat("EEEE,' the' dd 'of' MMMM, YYYY");
			model.addAttribute("dformat",sm.format(date));
			return "date.jsp";
			
		}else {
			SimpleDateFormat sm = new SimpleDateFormat("h:mm a");
			model.addAttribute("time",date);
			model.addAttribute("tformat",sm.format(date));
			return "time.jsp";
		}
	}
	
	
	
	
}
