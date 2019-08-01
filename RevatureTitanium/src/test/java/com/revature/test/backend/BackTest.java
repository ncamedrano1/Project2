package com.revature.test.backend;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.titanium.repository.SubjectTypesRepositoryImpl;

public class BackTest {
	SubjectTypesRepositoryImpl stri;
	
	
	@BeforeTest
	public void testSetup() {
		stri = new SubjectTypesRepositoryImpl();
	}

	@Test
	public void findAll() {
		/*
		 * For this test, we want to see
		 * if we are actually pulling all of the
		 * subject types from the database
		 */
		assertNotNull(stri.findAll());
	}
	
	@Test
	public void findOne() {
		/*
		 * For this test, we are checking to make sure
		 * we are able to pull one subject by its id
		 * from the database
		 */
		assertNotNull(stri.findOneSubjectById(2));
	}
	
	@Test
	public void findSubName() {
		assertNotNull(stri.findSubjectNameById(7));
		//assertEquals();
	}
	
	@Test
	public void findIdByName() {
		//assertEquals()
		//assertEquals(7, stri.findSubjectIdByName("servlets"));
	}
	
	@AfterTest
	public void testTeardown() {
		// Resetting our instance of SubjectTypesReposImpl
		stri = null;
	}
	
}
