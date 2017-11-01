package com.vsrkreddy.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.vsrkreddy.spring5webapp.model.Author;
import com.vsrkreddy.spring5webapp.model.Book;
import com.vsrkreddy.spring5webapp.model.Publisher;
import com.vsrkreddy.spring5webapp.repository.AuthorRepository;
import com.vsrkreddy.spring5webapp.repository.BookRepository;
import com.vsrkreddy.spring5webapp.repository.PublisherRepository;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>  {
	
	private AuthorRepository authorRepository;
	
	private BookRepository bookRepository;
	
	private PublisherRepository publisherRepository;
	
	
	
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository ) {
		
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		// TODO Auto-generated method stub
		initData();
		
	}

	public void initData() {
		Publisher publisher = new Publisher();
		publisher.setName("Pam ");
		publisherRepository.save(publisher);
		
		Author author = new Author("mohan", "sandula");
		Book book = new Book("Domain Driven Design", "1234", publisher);
		
		author.getBooks().add(book);
		
		authorRepository.save(author);
		bookRepository.save(book);
		
		
		Publisher publisher2 = new Publisher();
		publisher2.setName("Sam");
		publisherRepository.save(publisher2);
		
		Author author2 = new Author("virat", "kohli");
		Book book2 = new Book("Object Oriented Design", "5768", publisher2);
		author2.getBooks().add(book2);
		
		authorRepository.save(author2);
		bookRepository.save(book2);
	}

	

}
