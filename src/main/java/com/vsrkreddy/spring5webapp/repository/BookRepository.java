package com.vsrkreddy.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.vsrkreddy.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
