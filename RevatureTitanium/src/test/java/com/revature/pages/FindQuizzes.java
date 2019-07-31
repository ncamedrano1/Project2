package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FindQuizzes {
	
public String title = "GammaRayInformation";
	
	public FindQuizzes(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
