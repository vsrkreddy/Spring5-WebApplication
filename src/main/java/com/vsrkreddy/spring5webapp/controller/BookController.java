package com.vsrkreddy.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vsrkreddy.spring5webapp.repository.BookRepository;

@Controller
public class BookController {
	
	BookRepository bookRepository;
	
	
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}




	@RequestMapping("/books")
	public String getBook(Model model) {
		
		model.addAttribute("books", bookRepository.findAll());
		
		return "books";
		
	}

}
