package com.crack.interview.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Topic {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "topic_id")
	private List<Question> questions;

	 @JsonIgnore // Tell json not to include json object of tech from topic.
	@ManyToMany(mappedBy = "topics")
	private List<Technology> technologies;

	public Topic() {
		// TODO Auto-generated constructor stub
	}

	public Topic(String name) {
		super();
		this.name = name;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}

	public void addQuestion(Question question) {
		if (this.getQuestions() == null) {
			this.questions = new ArrayList<>();
		}
		this.getQuestions().add(question);
	}
	
	/**
	 * @param technology
	 */
	public void addTechnology(Technology technology) {
		if(this.getTechnologies() == null) {
			this.technologies = new ArrayList<>();
		}
		this.getTechnologies().add(technology);
	}
}
