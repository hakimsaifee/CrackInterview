package com.crack.interview.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crack.interview.entity.Technology;
import com.crack.interview.repository.AbstractRepository;
import com.crack.interview.service.impl.AbstractService;
import com.crack.interview.service.impl.TechnologyServiceImpl;

@RestController // Need to include jackson formattor to get xml/json as needed.
@RequestMapping(value = TechnologyController.TECHNOLOGY)
public class TechnologyController extends AbstractController<Technology, AbstractService<Technology,? extends AbstractRepository<Technology,Long>>>{

	protected static final String TECHNOLOGY = "technology";
	
	
	
	@Autowired
	public TechnologyController(TechnologyServiceImpl technologyService) {
		super(technologyService);
//		this.technologyService = technologyService;

	}
	
}
