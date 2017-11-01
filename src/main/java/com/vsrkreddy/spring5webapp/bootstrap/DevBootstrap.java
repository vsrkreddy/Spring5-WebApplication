package com.vsrkreddy.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.vsrkreddy.spring5webapp.model.Author;
import com.vsrkreddy.spring5webapp.model.Book;
import com.vsrkreddy.spring5webapp.repository.AuthorRepository;
import com.vsrkreddy.spring5webapp.repository.BookRepository;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>  {
	
	private AuthorRepository authorRepository;
	
	private BookRepository bookRepository;
	
	
	
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
		
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		// TODO Auto-generated method stub
		initData();
		
	}

	public void initData() {
		Author author = new Author("mohan", "sandula");
		Book book = new Book("Domain Driven Design", "1234", "Pat rilley's");
		author.getBooks().add(book);
		
		authorRepository.save(author);
		bookRepository.save(book);
		
		Author author2 = new Author("virat", "kohli");
		Book book2 = new Book("Object Oriented Design", "5768", "Mc Gill");
		author2.getBooks().add(book2);
		
		authorRepository.save(author2);
		bookRepository.save(book2);
	}

	

}
