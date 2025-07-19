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
	
	@FindBy(xpath= "(//button[@role='menuitem'])[1]")
	private  WebElement accessAppConsole;
	
	@FindBy(xpath="(//button[@role='menuitem'])[2]")
	private  WebElement accessOnSandbox;
	
	@FindBy(xpath="(//button[@role='menuitem'])[3]")
	private WebElement accessOnProduction;
	
	@FindBy(xpath = "//div[@class='nav-title']")
	private WebElement navTitle;
	
	@FindBy(xpath="//span[@class='user-name']")
	private WebElement vBankUserName;
	
	@FindBy(xpath="//span[text()='Logout']")
	private WebElement vBankLogout;

	public void create_New_App() {
		createNewApp.click();
	}
	
	public void clickViewInsights() {
		accessAppConsole.click();
	}
	
	public void clickAccessOnSandbox() {
		wait.until(ExpectedConditions.elementToBeClickable(accessOnSandbox)).click();
	}
	
	public void clickAccessOnProduction() {
		wait.until(ExpectedConditions.elementToBeClickable(accessOnProduction)).click();
	}
	
	 public void verifyUserIsOnVBankLandingPage() {
	        new WebDriverWait(driver, Duration.ofSeconds(5))
	            .until(ExpectedConditions.visibilityOf(navTitle));
	        Assert.assertTrue(navTitle.isDisplayed(), "User not landed on vBank Landing page");
	    }
	 

	  public void verifyRuntimeUrl() {
	        String actualURL = driver.getCurrentUrl();
	        Assert.assertEquals(actualURL, "https://decimal-vhub.vahanacloud.xyz/login", "Incorrect Runtime URL");
}
	  
	  public void clickUserName() {
		  vBankUserName.click();
	  }
	  
	  public void clickVBankLogout() {
		  wait.until(ExpectedConditions.elementToBeClickable(vBankLogout)).click();
	  }
	  
	  
}