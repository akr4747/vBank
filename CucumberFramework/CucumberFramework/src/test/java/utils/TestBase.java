package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.LandingPage;

import pageObjects.LoginPage;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		String browser_properties = prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		// result = testCondition ? value1 : value2
		
		String browser = browser_maven!=null ? browser_maven : browser_properties;
		
		if(driver == null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				ChromeOptions chromeoption=new ChromeOptions();
				 chromeoption.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//chromedriver");
		driver = new ChromeDriver(chromeoption);// driver gets the life
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
		//		System.setProperty("webdriver.gecko.driver","//src//test//resources//geckodriver 5");
		//		driver = new FirefoxDriver();
			}
		
		driver.get(url);	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		LoginPage lp =new LoginPage(driver);
		String username = prop.getProperty("userName");
		String password = prop.getProperty("password");
		lp.enterUserEmail(username);
		lp.enterUserPassword(password);
	//	lp.clickCaptcha();
	//	Thread.sleep(3000);
		lp.clickLoginButton();
		}
		
		return driver;
		
	}
	
	
	
}

