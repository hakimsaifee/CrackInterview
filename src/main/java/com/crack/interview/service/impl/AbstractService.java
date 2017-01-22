package com.crack.interview.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.crack.interview.repository.AbstractRepository;

public class AbstractService<T, E extends AbstractRepository<T, Long>> {

	protected  final E repository;
	
	 public AbstractService(E repository) {
		this.repository = repository;
	}

	public E getRepository() {
		return repository;
	}
	
	public  Iterable<T> getAll(int pageNumber, int pageSize) {
		Pageable page = new PageRequest(pageNumber-1, pageSize);
		Page<T> pagedElements = repository.findAll(page);
		return pagedElements.getContent();
	}
	
	public  Iterable<T> getAll() {
		return repository.findAll();
	}
	public T findById(Long id) {
		return repository.findOne(id);
	}
	
	public long getCount() {
		return repository.count();
	}
}
