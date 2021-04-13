package com.example.demo.services;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepository;

@Service
public class BookService implements BookRepository {

	// adding the book repository and a dependency
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	
	// returns all the books
	public List<Book> allBooks() {
		return bookRepository.findAll();  
	}

	// creates a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	// retrieves a book
	public Book findBook(Long id) {
		Book optionalBook = bookRepository.findById(id).orElse(null);
		return optionalBook;
		
	}
	
	
	public void updateBook(int id, Book book) {
	
		bookRepository.save(book);
	}

	@Override
	public <S extends Book> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Book> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Book> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Book entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Book> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findByDescriptionContaining(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long countByTitleContaining(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long deleteByTitleStartingWith(String search) {
		// TODO Auto-generated method stub
		return null;
	}


	public void destroyBook(Long id) {
		
        bookRepository.deleteById(id);
		
	}


	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Book book = bookRepository.findById(id).orElse(null);
		
		book.setTitle(title);
		book.setDescription(desc);
		book.setLanguage(lang);
		book.setNumberOfPages(numOfPages);
		
		bookRepository.save(book);
	
		return null;
	}


	public void deleteBook(Long id) {
		// TODO Auto-generated method stub
		 bookRepository.deleteById(id);
	}

}
