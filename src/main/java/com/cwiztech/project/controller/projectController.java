package com.cwiztech.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cwiztech.project.model.Project;
import com.cwiztech.project.repository.projectRepository;

@RestController
@CrossOrigin
@RequestMapping("/project")
public class projectController {
	
	@Autowired
	private projectRepository projectrepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Project> get() {
		
		List<Project> projects = projectrepository.findActive(); 
		
		return projects;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String getAll() {
		return "Welcome to Project All";
	}

}
