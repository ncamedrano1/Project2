package com.titanium.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.titanium.aspect.LoggingAspect;
import com.titanium.models.SubjectTypes;
import com.titanium.repository.SubjectTypesRepository;
import com.titanium.repository.SubjectTypesRepositoryImpl;

@Service
public class SubjectTypesServiceImpl implements SubjectTypesService {

	private SubjectTypesRepository subjectTypesRepository = new SubjectTypesRepositoryImpl();
	LoggingAspect la = new LoggingAspect();

	public SubjectTypesServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SubjectTypes> findAll() {
		la.callLog(this);
		System.out.println("findAll inside :: " + this.getClass().getName());

		// WHY IS THIS NULL?
		return subjectTypesRepository.findAll();
	}

}
