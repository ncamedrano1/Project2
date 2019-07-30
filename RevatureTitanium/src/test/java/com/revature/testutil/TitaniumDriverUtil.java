package com.revature.testutil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TitaniumDriverUtil {
	
	public static WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
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
