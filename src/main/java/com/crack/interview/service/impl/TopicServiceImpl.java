package com.crack.interview.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crack.interview.entity.Topic;
import com.crack.interview.repository.TopicRepository;
import com.crack.interview.service.TopicService;

@Service
public class TopicServiceImpl extends AbstractService<Topic, TopicRepository> implements TopicService{

	@Autowired
	public TopicServiceImpl(TopicRepository repository) {
		super(repository);
	}

}
