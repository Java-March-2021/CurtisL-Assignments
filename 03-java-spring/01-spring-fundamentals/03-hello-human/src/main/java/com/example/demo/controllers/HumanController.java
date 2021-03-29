package com.example.demo.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HumanController {

	@RequestMapping("/")
	public String human(@RequestParam(value="f",defaultValue="Human")String name,Model model) {
		System.out.println(name);
		if (name.isEmpty()){
			name = "Human";
			return "human.jsp";
		} 
		model.addAttribute("name",name);//this "name" will go to : <c:out value="${name}"/> in jsp file
		
		return "human.jsp";
	}
}
