package com.crack.interview.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crack.interview.page.wrapper.AbstractPageWrapper;
import com.crack.interview.repository.AbstractRepository;
import com.crack.interview.service.impl.AbstractService;

public class AbstractController<T, E extends AbstractService<T, ? extends AbstractRepository<T,Long>>> {

	protected E service;
	
	
	public AbstractController(E service) {
		this.service = service;
	}

	public E getService() {
		return service;
	}
	
	@RequestMapping(path = "getAll" , produces=MediaType.APPLICATION_JSON_VALUE)
	public Iterable<T> getAll() {
		System.out.println("Inside get all");
		List<T> list = new ArrayList<T>();
		Iterable<T> elements = service.getAll();
		Iterator<T> i = elements.iterator();
		while(i.hasNext()) {
			T tech = i.next();
			list.add(tech);
		}
		return list;
	}

	@RequestMapping(path = "getAll/{pageNumber}/{pageSize}" , produces=MediaType.APPLICATION_JSON_VALUE)
	public AbstractPageWrapper<T> getAllPagedElements(@PathVariable("pageNumber") int pageNumber,
			@PathVariable("pageSize") int pageSize) {
		System.out.println("Inside get all");
		System.out.println("Page Number : " + pageNumber);
		System.out.println("Page Size : " + pageSize);
		List<T> list = new ArrayList<T>();
		Iterable<T> elements = service.getAll(pageNumber, pageSize);
		Iterator<T> i = elements.iterator();
		while(i.hasNext()) {
			T tech = i.next();
			list.add(tech);
		}
		AbstractPageWrapper<T> pageWrapper = new AbstractPageWrapper<>();
		pageWrapper.setElements(list);
		int totalPages = (int) service.getCount();
		pageWrapper.setTotalRecords(totalPages);
		return pageWrapper;
	}
	
	@RequestMapping(path = "get/{id}" , produces=MediaType.APPLICATION_JSON_VALUE)
	public T getAll1(@PathVariable("id") String id) {
		Long entityId = Long.parseLong(id);
		return service.findById(entityId);
	}
	
	
/*	@RequestMapping(path = "get/{id}" , produces=MediaType.APPLICATION_JSON_VALUE)
	public AbstractPageWrapper<T> getAllWithPagination(@PathVariable("id") String id) {

		AbstractPageWrapper<T> pageWrapper = new AbstractPageWrapper<>();
		List<T> elements = new ArrayList<T>();
		Iterable<T> iterableElements = service.getAll();
		Iterator<T> i = iterableElements.iterator();
		while(i.hasNext()) {
			T element = i.next();
			elements.add(element);
		}
		pageWrapper.setElements(elements);
		 
		return pageWrapper;
	}
*/	
}
