package com.revature.test.frontend;

import static com.revature.test.frontend.TitaniumDriverUtility.driver;
import static org.junit.Assert.assertEquals;

import com.revature.pages.FindFlashcards;
import com.revature.pages.FindLogin;
import com.revature.pages.FindPerformance;
import com.revature.pages.FindProfile;
import com.revature.pages.FindQuizzes;
import com.revature.pages.FindResources;
import com.revature.pages.TitaniumHome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TitaniumGlue {
	
	public TitaniumHome th;
	public FindFlashcards ff;
	public FindQuizzes fq;
	public FindResources fr;
	public FindPerformance fp;
	public FindProfile fpro;
	public FindLogin fl;
	
	
	
	@Given("^a user is at the homepage of Revature Titanium$")
	public void a_user_is_at_the_homepage_of_Revature_Titanium() throws Throwable {
		th = new TitaniumHome(driver);
	    assertEquals(th.title, driver.getTitle());
	}

	@When("^a user clicks on the flashcards button$")
	public void a_user_clicks_on_the_flashcards_button() throws Throwable {
		th = new TitaniumHome(driver);
		th.flashCardButton.click();
	}

	@Then("^a user is redirected to the flashcards page$")
	public void a_user_is_redirected_to_the_flashcards_page() throws Throwable {
	    ff = new FindFlashcards(driver);
	    assertEquals(ff.title, driver.getTitle());
	}
	
	@When("^a user clicks on the quizzes button$")
	public void a_user_clicks_on_the_quizzes_button() throws Throwable {
		th = new TitaniumHome(driver);
		th.quizzesButton.click();
	}

	@Then("^a user is redirected to the quizzes page$")
	public void a_user_is_redirected_to_the_quizzes_page() throws Throwable {
		 fq = new FindQuizzes(driver);
		   assertEquals(fq.title, driver.getTitle());
	}
	
	@When("^a user clicks on the resources button$")
	public void a_user_clicks_on_the_resources_button() throws Throwable {
	    th = new TitaniumHome(driver);
	    th.resourcesButton.click();
	}

	@Then("^a user is redirected to the resources page$")
	public void a_user_is_redirected_to_the_resources_page() throws Throwable {
	    fr = new FindResources(driver);
	    assertEquals(fr.title, driver.getTitle());
	}

	@When("^a user clicks on the performance button$")
	public void a_user_clicks_on_the_performance_button() throws Throwable {
		th = new TitaniumHome(driver);
	    th.performanceButton.click();
	}

	@Then("^a user is redirected to the performance page$")
	public void a_user_is_redirected_to_the_performance_page() throws Throwable {
		fp = new FindPerformance(driver);
	    assertEquals(fp.title, driver.getTitle());
	}

	@When("^a user clicks on the profile button$")
	public void a_user_clicks_on_the_profile_button() throws Throwable {
		th = new TitaniumHome(driver);
	    th.profileButton.click();
	}

	@Then("^a user is redirected to the profile page$")
	public void a_user_is_redirected_to_the_profile_page() throws Throwable {
		fpro = new FindProfile(driver);
	    assertEquals(fpro.title, driver.getTitle());
	}

	@When("^a user clicks on the login button$")
	public void a_user_clicks_on_the_login_button() throws Throwable {
		th = new TitaniumHome(driver);
	    th.loginButton.click();
	}

	@Then("^a user is redirected to the login page$")
	public void a_user_is_redirected_to_the_login_page() throws Throwable {
		fl = new FindLogin(driver);
	    assertEquals(fl.title, driver.getTitle());
	}

}
