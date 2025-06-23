package pageObjects;

import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class VBankLandingPage {

	public WebDriver driver;
	public WebDriverWait wait;

	public VBankLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	@FindBy(xpath = "//div[@class='add-new']")
	private WebElement createNewApp;
	
	@FindBy(xpath= "//span[@class='mdc-button__label']/span")
	private  WebElement accessAppConsole;
	
	@FindBy(xpath = "//div[@class='nav-title']")
	private WebElement navTitle;

	public void create_New_App() {
		createNewApp.click();
	}
	
	public void clickViewInsights() {
		accessAppConsole.click();
	}
	
	 public void verifyUserIsOnVBankLandingPage() {
	        new WebDriverWait(driver, Duration.ofSeconds(5))
	            .until(ExpectedConditions.visibilityOf(navTitle));
	        Assert.assertTrue(navTitle.isDisplayed(), "User not landed on vBank Landing page");
	    }
	 

	  public void verifyRuntimeUrl(String expectedURL) {
	        String actualURL = driver.getCurrentUrl();
	        Assert.assertEquals(actualURL, expectedURL, "Incorrect Runtime URL");
}
}