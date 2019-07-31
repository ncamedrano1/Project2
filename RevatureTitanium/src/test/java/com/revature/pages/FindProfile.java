package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FindProfile {
	
public String title = "GammaRayInformation";
	
	public FindProfile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
