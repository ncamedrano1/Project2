package com.titanium.main;

import com.titanium.services.SubjectTypesService;
import com.titanium.services.SubjectTypesServiceImpl;

public class Driver {

	public static void main(String[] args) {
		SubjectTypesService subServ = new SubjectTypesServiceImpl();

		System.out.println("All Subjects");

//		SubjectTypesRepository subRepo = new SubjectTypesRepositoryImpl();
//		System.out.println("Subject Name By Id");
//		System.out.println(subRepo.findSubjectNameById(2));

	}
}
