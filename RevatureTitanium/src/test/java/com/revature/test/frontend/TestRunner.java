package com.revature.test.frontend;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features/TitaniumFrontEndTests.feature"},
		glue= {"com.revature.test.frontend"}
		)
public class TestRunner {
	
}
