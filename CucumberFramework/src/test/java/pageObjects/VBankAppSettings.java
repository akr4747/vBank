package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.RandomStringUtils;

public class VBankAppSettings {
	
public WebDriver driver;
	
	public VBankAppSettings(WebDriver driver)
	{
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//input[@id='mat-input-0']")
//	private WebElement enterAppName;
	
	By enterAppName=By.xpath("//input[@id='mat-input-0']");
	
	@FindBy(xpath="(//span[@class='mat-mdc-focus-indicator'])[1]")
	private WebElement effectiveDate;
	
	@FindBy(xpath="//span[contains(@class, 'mat-calendar-body-today')]")
	private WebElement currentEffectiveDate;
	
	@FindBy(xpath="//button[.//span[text()='Next']]")
	private WebElement nextButton;
	
	public void enter_App_Name() {
	//	enterAppName.sendKeys(appName);
		
		String apacheRandomString = generateApacheRandomString();
		driver.findElement(enterAppName).sendKeys(apacheRandomString);
	}


	private String generateApacheRandomString() {
		 return RandomStringUtils.randomAlphanumeric(8);
	}

	public void effective_Date() {
		 effectiveDate.click();
		
	}

	public void current_Effective_Date() {
		currentEffectiveDate.click();
	}
	public void next_Button(){
		nextButton.click();
	}
}
