package com.vsrkreddy.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.vsrkreddy.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

	
}
