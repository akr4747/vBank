package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@type='email']")
	private WebElement enterEmail;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement enterPassword;
	
	@FindBy(xpath="//div[@id='rc-anchor-container']//div[contains(@class, 'recaptcha-checkbox-border')]")
	private WebElement reCaptcha;
	
	@FindBy(xpath="//button[@id='adminLoginForm']")
	private WebElement login;
	
	@FindBy(xpath="//button[@id='adminLoginForm']")
	private WebElement clickSerachBox;
	

	By accountSerachBox=By.xpath("//input[@id='searchAccName']");
	By searchButton=By.xpath("//button[@id='search_btn']");
	
	@FindBy(css = "a.dropdown-item[href*='./account.php?accountid=42']")
	WebElement accountView;
	
	public void enterUserEmail(String userName)
	{
		enterEmail.sendKeys(userName);
	}
	
	public void enterUserPassword(String userPwd)
	{
		enterPassword.sendKeys(userPwd);
	}
	
/*	public void clickCaptcha() {
		reCaptcha.click();
	} */
	
	public void clickLoginButton() 
	{
		login.click();
	}
	
	public void clickOnSearchButton() 
	{
		clickSerachBox.click();
	}
	
	public void enterAccountNameOnSearchBox(String accountName) {
		
		driver.findElement(accountSerachBox).sendKeys(accountName);
	}
	
	public void selectSearchButton() {
		
		driver.findElement(searchButton).click();
	}
	
public void selectMoinAccount() throws InterruptedException {
	
	WebElement table = driver.findElement(By.xpath("//table[@id='accountsTable']"));

	// Get all rows in the table body
	List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

	// Loop through each row to find the "Moin" account
	for (WebElement row : rows) {
	    // Get the "Account Name" cell in the current row
	    WebElement accountNameCell = row.findElement(By.xpath(".//td[1]")); // Assuming Account Name is the first column

	    // Check if the cell contains "Moin"
	    if (accountNameCell.getText().equalsIgnoreCase("Moin")) {
	        // Click the "Action" button in the same row
	//        WebElement actionButton = row.findElement(By.xpath(".//td[last()]//button[contains(@class, 'dropdown-toggle')]")); // Adjust button locator as needed
	        
	        WebElement actionButton = row.findElement(By.xpath(".//td[last()]//button[contains(@class, 'dropdown-toggle')]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionButton);    
	  //      actionButton.click();
	        
	        WebElement viewButton = row.findElement(By.xpath(".//td[last()]//a[contains(text(), 'View')]"));
	        viewButton.click();
	        
	        break; // Exit the loop once the action button is clicked
	    }
	}

	}


}
