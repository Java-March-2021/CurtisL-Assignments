package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping("/dojo")
	public String dojo() {
		 return "Coding dojo is awesome";
	}
	
	@RequestMapping("/dojo/{location}")
	public String display(@PathVariable("location") String location) {
		switch(location){
			case "burbank":
				return "Burbank dojo is located in Southern California";
			case "san-jose":
				return "SJ dojo is the headquarters";
				default:
					return String.format("%s is also great",location);
		}
	}
	
	
}
