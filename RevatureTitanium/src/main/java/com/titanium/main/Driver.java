package com.titanium.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.titanium.configuration.JdbcConfig;
import com.titanium.services.SubjectTypesService;
import com.titanium.services.SubjectTypesServiceImpl;

public class Driver {

	public static void main(String[] args) {

		SubjectTypesService subServ = new SubjectTypesServiceImpl();
		System.out.println("All Subjects");
		System.out.println(subServ.findAll());
		subServ.findAll();

	}
}
