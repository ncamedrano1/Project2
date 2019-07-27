package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.SubjectTypes;
import com.revature.repository.SubjectTypesRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/subjects")
public class SubjectTypesController {
	
	@Autowired
	private SubjectTypesRepository subjectTypesRepository;

	@RequestMapping(value = "/all")
	public List<SubjectTypes> findAll() {
		return subjectTypesRepository.findAll();
	}
}
