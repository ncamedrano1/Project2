package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FindPerformance {
	
public String title = "GammaRayInformation";
	
	public FindPerformance(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
