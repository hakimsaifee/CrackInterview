package com.crack.interview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleHTMLController {

	@RequestMapping(path = "/person1")
	public String getPerson(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "/personTemplate";
		
	}
	
	@RequestMapping(path = "/people")
	public String getPeople() {
		return "navigation";
		
	}
	
	@RequestMapping(path = "/home1")
	public String getPeople1() {
		return "questionGrid";
	}
	
	
	@RequestMapping(path = "/home")
	public String home() {
		return "home";
	}
	@RequestMapping(path = "/showQuestions")
	public String showQuestions() {
		return "showQuestions";
		
	}
	
	@RequestMapping(path = "/showQuestionDetail")
	public String showQuestionDetail() {
		return "showQuestionDetail";
		
	}
	
	@RequestMapping(path = "/bootstrap")
	public String bootstrap() {
		return "bootstrap";
		
	}
	
	@RequestMapping(path = "/index1")
	public String index1() {
		return "index1";
		
	}
	
	@RequestMapping(path = "/showTopics")
	public String showTopics() {
		System.out.println("Inside topic");
		return "showTopics";
		
	}
}
