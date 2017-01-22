package com.crack.interview.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.crack.interview.entity.Question;

public interface QuestionRepository extends AbstractRepository<Question, Long>{

//	findBy + (the foreign key member of student class with first letter Upper) 
//	+ underscore +the data member of Teacher Class with first letter UpperCase +(String teacherId);
//	List<Question> findByTopic_Id(Long topicId);
	Page<Question> findByTopic_Id(Long topicId, Pageable page);

	
}
