package com.titanium.main;

import com.titanium.repository.SubjectTypesRepository;
import com.titanium.repository.SubjectTypesRepositoryImpl;
import com.titanium.services.SubjectTypesService;
import com.titanium.services.SubjectTypesServiceImpl;

public class Driver {

	public static void main(String[] args) {
		SubjectTypesService subServ = new SubjectTypesServiceImpl();
//		System.out.println(subServ.findAll());

		SubjectTypesRepository subRepo = new SubjectTypesRepositoryImpl();
//		System.out.println("Subject Name By Id");
//		System.out.println(subRepo.findSubjectNameById(2));
		System.out.println(subRepo.findOneSubjectById(1).toString());
		System.out.println(subRepo.findSubjectIdByName("JAva"));
	}
}
