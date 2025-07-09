package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class VHubMySubscriptions {
	
	public WebDriver driver;
	public WebDriverWait wait;

	public VHubMySubscriptions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(1));
	}

	@FindBy(xpath="(//div[@role='button']/div)[5]")
	private WebElement  assetName;
	
	@FindBy(xpath="//button/span[@class='mdc-button__label']")
	private WebElement exploreAssets;
	
	@FindBy(xpath="(//button[@color='primary']/span)[2]")
	private WebElement exploreUseCase;
	
	
   public void clickOnExploreAssetsOrUserOnMySubscriptionsPage(String expectedText) {
	   
	   try {
	        // Try waiting for the Explore Assets button
	        wait.until(ExpectedConditions.visibilityOf(exploreAssets)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(exploreUseCase));
	        String actualText = exploreUseCase.getText();
	        String expectedText1="Explore Use Cases";
	        Assert.assertEquals(actualText,expectedText1, "Button text mismatch after clicking Explore.");
	        
	    } catch (Exception e) {
	        // If Explore button is not found, then validate asset table instead
	        try {
	            wait.until(ExpectedConditions.visibilityOf(assetName));
	            String actualText = assetName.getText();
	            Assert.assertEquals(actualText, expectedText, "Incorrect Text displayed on the subscription table.");
	            System.out.println("Asset table found and verified.");
	        } catch (Exception ex) {
	            Assert.fail("Neither Explore Assets button nor Asset Table found.");
	        }
	    }
	}
  }