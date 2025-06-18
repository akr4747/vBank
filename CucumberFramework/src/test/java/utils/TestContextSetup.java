package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {

	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;

//	public GTDLandingPageStepDefinition gtdLandingPageStepDefinition;

	
	public TestContextSetup() throws IOException, InterruptedException
	{
		testBase = new TestBase();
		driver = testBase.WebDriverManager();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
//		gtdLandingPageStepDefinition=new GDTLandingPageStepDefinition(testBase.WebDriverManager());	

	}
	
}
