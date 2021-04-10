package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;

@Controller
public class BooksController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/books")
	public String index(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books",books);
		
		return "/books/index.jsp";
	}
	
	@RequestMapping("books/{index}")
	public String findBookByIndex(Model model, @PathVariable("index") Long index){
		Book book = bookService.findBook(index);
		model.addAttribute("book",book);
		return "showBook.jsp";
	}
	
	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		bookService.save(book);
		return "/books/new.jsp";
	}
	
	@RequestMapping(value="/books", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("books") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/books/new.jsp";
		}else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("books") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/books/new.jsp";
		}else {
			bookService.save(book);
			return "redirect:/books";
		}
	}
}
