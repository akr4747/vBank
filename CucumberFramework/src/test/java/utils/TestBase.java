package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.VHubLandingPage;

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
		driver.manage().deleteAllCookies();
		VHubLandingPage vHub =new VHubLandingPage(driver);
		String username = prop.getProperty("userName");
		String password = prop.getProperty("password");
		vHub.login_SignUp_Button();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mat-input-1")));
		vHub.enter_User_Email(username);
		vHub.enter_User_Password(password);
		vHub.click_Login_Button();
		}
		
		return driver;
		
	}
	
	
	
}

