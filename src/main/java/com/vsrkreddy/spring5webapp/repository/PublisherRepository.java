package com.vsrkreddy.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.vsrkreddy.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
