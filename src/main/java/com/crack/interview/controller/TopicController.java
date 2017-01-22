package com.crack.interview.controller;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crack.interview.entity.Question;
import com.crack.interview.entity.Topic;
import com.crack.interview.repository.AbstractRepository;
import com.crack.interview.service.TopicService;
import com.crack.interview.service.impl.AbstractService;
import com.crack.interview.service.impl.TopicServiceImpl;

@RestController // Need to include jackson formattor to get xml/json as needed.
@RequestMapping(value = TopicController.TOPIC)
public class TopicController extends AbstractController<Topic, AbstractService<Topic,? extends AbstractRepository<Topic,Long>>>{

	protected static final String TOPIC = "topic";
	
	private TopicServiceImpl topicService;
	
	@Autowired
	public TopicController(TopicServiceImpl topicService) {
		super(topicService);
		this.topicService = topicService;
	}
	
	@RequestMapping(path = "getByTechnoloyId" , produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Topic> getTopicsByTechnologyId(@RequestParam("technologyId") int technologyId) {
		System.out.println("getTopicsByTechnologyId" + technologyId);
		
//		Topic topic = new Topic();
//		topic.setId(Long.parseLong(topicId));
//		return this.questionService.getQuestionsByTopicId(Long.parseLong(topicId),Integer.parseInt(pageNumber),Integer.parseInt(pageSize));
		List<Topic> list = new ArrayList<Topic>();
		Iterable<Topic> elements = service.getAll();
		Iterator<Topic> i = elements.iterator();
		while(i.hasNext()) {
			Topic tech = i.next();
			list.add(tech);
		}
		return list;
	}


}
