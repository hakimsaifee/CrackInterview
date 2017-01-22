package com.crack.interview.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.crack.interview.entity.Question;
import com.crack.interview.page.wrapper.AbstractPageWrapper;
import com.crack.interview.repository.QuestionRepository;
import com.crack.interview.service.QuestionService;
import com.crack.interview.util.CodeExecutorUtil;

@Service
public class QuestionServiceImpl extends AbstractService<Question, QuestionRepository> implements QuestionService{

	private QuestionRepository questionRepository;
	@Autowired
	public QuestionServiceImpl(QuestionRepository repository) {
		super(repository);
		this.questionRepository = repository;
	}

	public AbstractPageWrapper<Question> getQuestionsByTopicId(Long topicId, int pageNumber, int pageSize) {
		Pageable page = new PageRequest(pageNumber-1, pageSize);
		Page<Question> pagedElements = questionRepository.findByTopic_Id(topicId, page);
		int totalPages = pagedElements.getTotalPages();
		System.out.println("Total Pages : " + totalPages);
		int totalRecords = totalPages * pageSize;
		AbstractPageWrapper<Question> pageWrapper = new AbstractPageWrapper<>();
		pageWrapper.setElements(pagedElements.getContent());
		pageWrapper.setTotalRecords(totalRecords);
		return pageWrapper;
	}
	
	public String exectueCode(String code) {
		return CodeExecutorUtil.startProcess(code);
	}
}
