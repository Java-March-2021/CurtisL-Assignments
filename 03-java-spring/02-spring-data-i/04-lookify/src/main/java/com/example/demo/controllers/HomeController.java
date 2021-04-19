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

import com.example.demo.models.Song;
import com.example.demo.services.SongServices;

@Controller
public class HomeController {
	@Autowired
	SongServices service;
	
	@GetMapping("/")
	public String index() {
		
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = service.findAll();
		model.addAttribute("songs",songs);
		return "dashboard.jsp";
	}
	
	@PostMapping("/search")
	public String search(@RequestParam("artist")String artist,Model model) {
		List<Song> songs = service.findByArtistContaining(artist);
		model.addAttribute("songs",songs);
		return"/search/search.jsp";
				
	}
	
	@GetMapping("/topTen")
	public String topTen(Model model) {
		
		List<Song> top = service.findTop10ByOrderByRatingDesc();
		System.out.println(top);
		model.addAttribute("songs",top);
		return"/search/topTen.jsp";
	}
	
	@GetMapping("/new")
	public String newSong(@ModelAttribute("song")Song song,Model model) {
		
		model.addAttribute("song",song);
		
		return"newSong.jsp";
	}
	
	@PostMapping("/new")
	public String createSong(@Valid @ModelAttribute("song")Song song,BindingResult result) {
		if (result.hasErrors()) {
			return "newSong.jsp";
		} else {
			service.save(song);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("show/{id}")
	public String display(@PathVariable("id")Long id ,Model model) {
		Song song = service.findById(id).orElse(null);
		model.addAttribute("song",song);
		return"show.jsp";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id")Long id ,Model model) {
		Song song = service.findById(id).orElse(null);
		model.addAttribute("song",song);
		return"delete.jsp";
	}
	
	@PostMapping("/delete/{id}")
	public String destroy(@PathVariable("id")Long id) {
		
			service.deleteById(id);
			return "redirect:/dashboard";
		
	}
	
	

}
