package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TitaniumHome {

public String title="GammaRayInformation";
	
	@FindBy(xpath="//li[@class='nav-item']//a[@routerlink='home']")
	public WebElement homeButton;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@routerlink='flashcards']")
	public WebElement flashCardButton;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@routerlink='quizzes']")
	public WebElement quizzesButton;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@routerlink='resources']")
	public WebElement resourcesButton;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@routerlink='performance']")
	public WebElement performanceButton;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@routerlink='profile']")
	public WebElement profileButton;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@routerlink='login']")
	public WebElement loginButton;
	
	public TitaniumHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
