package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//1.Annotation
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	//1.Annotation
	@RequestMapping("/")
	//3/Method that maps to the request route above
	public String hello() {
		return"Hello Client. How are you doing?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "This is the random method being called";
	}

}
