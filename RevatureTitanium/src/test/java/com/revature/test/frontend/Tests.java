package com.revature.test.frontend;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests {
	
	@Test
	  public void Test1() {
		  System.out.println("TEST 1");
	  }
	  
	  @Test
	  public void Test2() {
		  System.out.println("TEST 2");
	  }
	  
	  @Test
	  public void Test3() {
		  System.out.println("TEST 3");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("BEFORE METHOD");
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("AFTER METHOD");
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("BEFORE TEST");
	  }
	  
	  @AfterTest
	  public void afterTest() {
		  System.out.println("AFTER TEST");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("BEFORE CLASS");
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  System.out.println("AFTER CLASS");
	  }
	  
	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("BEFORE SUITE");
	  }
	  
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("AFTER SUITE");
	  }
}
