package pageObjects;

import java.util.Random;
import java.util.UUID;
import org.apache.commons.lang3.RandomStringUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

public WebDriver driver;
	
	public CreateAccountPage(WebDriver driver)
	{
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
	By createAccountButton=By.xpath("(//button[@class='btn btn-primary btn-50'])[2]");
	By accountName=By.xpath("//input[@id='acc_name']");
	By primaryContactName=By.xpath("//input[@name='purchaser_name']");
	By email=By.xpath("//input[@id='purchaser_email']");
	By phone=By.xpath("//input[@type='number']");
	By accountType=By.xpath("//input[@id='company']");
	By billingAddress1=By.xpath("//input[@name='billing_line_one']");
	By billingAddress2=By.xpath("//input[@name='billing_line_two']");
	By billingCity=By.xpath("//input[@name='city']"); 
	By billingState=By.xpath("//input[@name='state']");
	By billingPostalCode=By.xpath("//input[@name='postal_code']");
	
	public void clickCreateAccountButton() {
		driver.findElement(createAccountButton).click();
	}
	
	
	public String generateApacheRandomString() {
	    return RandomStringUtils.randomAlphanumeric(8); // Generates an 8-character alphanumeric string
	}
	
	public void enterAccountName() {
	//	driver.findElement(accountName).sendKeys(userAccountName);
		
	//	String uuid = UUID.randomUUID().toString();
	//	driver.findElement(accountName).sendKeys(uuid);

		String apacheRandomString = generateApacheRandomString();
		driver.findElement(accountName).sendKeys(apacheRandomString);
	}
	
	
	public void enterPrimaryContactName(String userPrimaryContactName) {
		driver.findElement(primaryContactName).sendKeys(userPrimaryContactName);
	}
	
	public void enterEmail() {
		driver.findElement(email).click();		 
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		driver.findElement(email).sendKeys("username"+ randomInt +"@gmail.com");  
	}
	
	public void enterPhone(String userPhone) {
		driver.findElement(phone).sendKeys(userPhone);
	}
	
	public void selectAccountType() {
		driver.findElement(accountType).click();		
	}
	
	public void selectBillingCountry() {
		
		Select se=new Select(driver.findElement(By.id("billing_country")));

		se.selectByVisibleText("Afghanistan");
	}
	
	public void enterBillingAddress1(String userBillingAddress1) {
		driver.findElement(billingAddress1).sendKeys(userBillingAddress1);
	}
	
	public void enterBillingAddress2(String userBillingAddress2) {
		driver.findElement(billingAddress2).sendKeys(userBillingAddress2);
	}
	
	public void enterBillingCity(String userBillingCity) {
		driver.findElement(billingCity).sendKeys(userBillingCity);
	}
	
	public void enterBillingState(String userBillingState) {
		driver.findElement(billingState).sendKeys(userBillingState);
	}
	
	public void enterBillingPostalCode(String userBillingPostalCode) {
		driver.findElement(billingPostalCode).sendKeys(userBillingPostalCode);
	}
	
	public void clickSaveNewAccount() {
		
		WebElement button = driver.findElement(By.cssSelector("button[class='btn btn-primary save_new_acc_btn h-auto']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
	}
	
}
