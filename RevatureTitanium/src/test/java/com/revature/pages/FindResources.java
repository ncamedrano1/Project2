package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FindResources {
	
public String title = "GammaRayInformation";
	
	public FindResources(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
