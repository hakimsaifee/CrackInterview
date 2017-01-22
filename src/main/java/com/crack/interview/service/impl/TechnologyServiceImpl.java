package com.crack.interview.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crack.interview.entity.Technology;
import com.crack.interview.repository.TechnologyRepository;
import com.crack.interview.service.TechnologyService;

@Service
public class TechnologyServiceImpl extends AbstractService<Technology, TechnologyRepository> implements TechnologyService{

	@Autowired
	public TechnologyServiceImpl(TechnologyRepository repository) {
		super(repository);
	}

}
