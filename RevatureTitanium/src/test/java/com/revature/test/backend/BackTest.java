package com.revature.test.backend;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.titanium.repository.SubjectTypesRepositoryImpl;

public class BackTest {
	SubjectTypesRepositoryImpl stri;
	@BeforeTest
	public void setup() {
		stri = new SubjectTypesRepositoryImpl();
	}

	@Test
	public void findAll() {
		// For this test, we want to see
		// if we are actually pulling all of the
		// subject types from the database
		assertNotNull(stri.findAll());
	}
	
	@AfterTest
	public void afterAll() {
		assertTrue(stri.findAll() != null);
	}
	
}
