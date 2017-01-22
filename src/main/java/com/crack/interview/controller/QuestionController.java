package com.crack.interview.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crack.interview.dto.CodeDTO;
import com.crack.interview.entity.Question;
import com.crack.interview.entity.Topic;
import com.crack.interview.page.wrapper.AbstractPageWrapper;
import com.crack.interview.repository.AbstractRepository;
import com.crack.interview.service.impl.AbstractService;
import com.crack.interview.service.impl.QuestionServiceImpl;

@RestController // Need to include jackson formattor to get xml/json as needed.
@RequestMapping(value = QuestionController.QUESTION)
public class QuestionController extends AbstractController<Question, AbstractService<Question,? extends AbstractRepository<Question,Long>>>{

	protected static final String QUESTION = "question";
	
	private QuestionServiceImpl questionService;
	
	@Autowired
	public QuestionController(QuestionServiceImpl questionService) {
		super(questionService);
//		this.technologyService = technologyService;
		this.questionService = questionService;

	}
	

	@RequestMapping(path = "getByTopicId/{topicId}/{pageNumber}/{pageSize}" , produces=MediaType.APPLICATION_JSON_VALUE)
	public AbstractPageWrapper<Question> getQuestionsByTopicId(@PathVariable("topicId") String topicId, @PathVariable("pageNumber") String pageNumber,
			@PathVariable("pageSize") String pageSize) {
		System.out.println("getQuestionsByTopicId" + Long.parseLong(topicId));
		System.out.println("PageSize:" + Integer.parseInt(pageNumber));
		System.out.println("PageNumber:" + Integer.parseInt(pageSize));
		
		Topic topic = new Topic();
		topic.setId(Long.parseLong(topicId));
		long totalRecords = questionService.getCount();
		System.out.println("Total Questions By Id : " + totalRecords);
		return this.questionService.getQuestionsByTopicId(Long.parseLong(topicId),Integer.parseInt(pageNumber),Integer.parseInt(pageSize));
	}

	@RequestMapping(path = "code" , method= RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public CodeDTO getQuestionsByTopicId(@RequestBody CodeDTO codeDTO) {
		System.out.println("Code" + codeDTO.getCode());
		String output = questionService.exectueCode(codeDTO.getCode());
		CodeDTO dto = new CodeDTO();
		dto.setOutput(output);
		return dto;
	}


}
