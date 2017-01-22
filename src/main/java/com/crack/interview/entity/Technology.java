package com.crack.interview.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

//	 @JsonIgnore
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Topic> topics;
	

	public Technology() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Technology(String name) {
		super();
		this.name = name;
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

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	public void addTopic(Topic topic) {
		if(this.getTopics() == null) {
			this.topics = new ArrayList<>();
		}
		this.getTopics().add(topic);
	}
}
