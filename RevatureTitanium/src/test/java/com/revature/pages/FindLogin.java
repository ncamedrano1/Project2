package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FindLogin {
	
public String title = "GammaRayInformation";
	
	public FindLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
