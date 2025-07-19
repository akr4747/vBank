package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
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

	private By assetName =By.xpath("(//div[@role='button']/div)[5]");
	
	private By exploreAssets =By.xpath("//button/span[@class='mdc-button__label']");
	
	private By exploreUseCase = By.xpath("(//button[@color='primary']/span)[2]");
	
	
   public void clickOnExploreAssetsOrUserOnMySubscriptionsPage(String expectedText) {
	   WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(2));

	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

	    try {
	        if (isElementVisible(exploreAssets, shortWait)) {
	            driver.findElement(exploreAssets).click();

	            wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
	            String actualText = driver.findElement(exploreUseCase).getText().trim();
	            Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
	        } else if (isElementVisible(assetName, shortWait)) {
	            String actualText = driver.findElement(assetName).getText().trim();
	            Assert.assertEquals(actualText, expectedText, "Incorrect text on subscription table.");
//	            System.out.println("Asset table found and verified.");
	        } else {
	            Assert.fail("Neither Explore Assets button nor Asset Table found.");
	        }
	    } finally {
	        // Restore implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	}

   public boolean isElementVisible(By locator, WebDriverWait customWait) {
	    try {
	        customWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}

  }