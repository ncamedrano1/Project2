package com.revature.test.frontend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TitaniumDriverUtility {
	
public static WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://josephigheawsbucket.s3-website.us-east-2.amazonaws.com/");
	}
	
	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		if(driver != null) {
			driver.quit();
		}
	}

}
