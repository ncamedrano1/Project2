package com.titanium.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.titanium.models.SubjectTypes;
import com.titanium.services.SubjectTypesService;
import com.titanium.services.SubjectTypesServiceImpl;

@Controller("subjecttypescontroller")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/subjects")
public class SubjectTypesControllerImpl {

	@Autowired
	private SubjectTypesService subjectTypesService = new SubjectTypesServiceImpl();

	@RequestMapping("/all")
	public @ResponseBody List<SubjectTypes> getAllSubjects() {
		System.out.println("reached subject controller find all method");
		System.out.println(subjectTypesService.findAll());
		return subjectTypesService.findAll();
	}
}
