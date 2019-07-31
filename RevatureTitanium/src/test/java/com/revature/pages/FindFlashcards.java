package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FindFlashcards {
	
	public String title = "GammaRayInformation";
	
	public FindFlashcards(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
