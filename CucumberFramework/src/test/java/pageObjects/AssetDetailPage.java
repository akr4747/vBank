package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssetDetailPage {
	
public WebDriver driver;
	
	public AssetDetailPage(WebDriver driver)
	{
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="(//span[text()='Experience For Free'])[1]")
	private WebElement exprience_For_Free;
	
	@FindBy(xpath="//button[contains(@class, 'mdc-button') and .//span[normalize-space(text())='Configure App']]")
	private WebElement  configureApp;
	

	public void clickExperienceOrConfigureApp() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

	    try {
	        // Check if "Experience For Free" button is present and visible
	        WebElement experienceButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("(//span[text()='Experience For Free'])[1]")));

	        if (experienceButton.isDisplayed()) {
	            experienceButton.click();
	            // Wait for the "Configure App" button to appear
	            wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//button[contains(@class, 'mdc-button') and .//span[normalize-space(text())='Configure App']]")));
	        }
	    } catch (Exception e) {
	        // "Experience For Free" is not present — possibly already clicked earlier
	        System.out.println("\"Experience For Free\" button not found. Assuming it's already clicked.");
	    }

	    // Now, try to click "Configure App"
	    WebElement configureAppButton = wait.until(ExpectedConditions.elementToBeClickable(
	        By.xpath("//button[contains(@class, 'mdc-button') and .//span[normalize-space(text())='Configure App']]")));
	    configureAppButton.click();
	}
	
}
