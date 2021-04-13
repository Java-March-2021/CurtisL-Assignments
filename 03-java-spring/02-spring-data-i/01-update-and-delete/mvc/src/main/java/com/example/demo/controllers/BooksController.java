package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		model.addAttribute("books", books);

		return "/books/index.jsp";
	}

	@RequestMapping("books/{index}")
	public String findBookByIndex(Model model, @PathVariable("index") Long index) {

		Book book = bookService.findBook(index);
		model.addAttribute("book", book);
		return "showBook.jsp";

	}

	@RequestMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		bookService.save(book);
		return "/books/new.jsp";
	}

	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("books") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "/books/new.jsp";
		} else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}

	@RequestMapping("/books/edit/{id}")
	public String editBook(@PathVariable("id") Long id, Model model) {

		Book book = bookService.findBook(id);
		if (bookService.existsById(id)) {
			model.addAttribute("book", book);
			return "books/editBook.jsp";
		} else {
			return "redirect:/books";
		}
	}

	@PostMapping("/books/edit/{id}")
	public String updateBook(@PathVariable("id") int id, @Valid @ModelAttribute("book") Book book,
			BindingResult result) {
		if (result.hasErrors()) {
			return "books/editBook.jsp";
		} else {
			bookService.updateBook(id, book);
			return "redirect:/books";
		}
	}

	@RequestMapping(value = "/books/delete/{id}")
	public String destroyBook(@PathVariable("id") Long id) {
		bookService.destroyBook(id);
		return "redirect:/books";
	}
	
	@PostMapping(value = "/books/delete/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		bookService.destroyBook(id);
		return "redirect:/books";
	}
	
	
}
