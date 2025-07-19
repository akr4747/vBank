package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class APIAssetDetailPage {

	public WebDriver driver;
	public WebDriverWait wait;

	public APIAssetDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[1]")
	private WebElement apiExperienceForFree;

	@FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
	private WebElement apiExperienceOnSwagger;

	@FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[3]")
	private WebElement apiExperienceOnPostman;

	@FindBy(xpath = "//nav[@class='nav-items']/a[1]")
	private WebElement apiAboutTab;

	@FindBy(xpath = "//nav[@class='nav-items']/a[2]")
	private WebElement apiDocumentationTab;

	@FindBy(xpath = "//nav[@class='nav-items']/a[3]")
	private WebElement apiFeaturesTab;

	@FindBy(xpath = "//nav[@class='nav-items']/a[5]")
	private WebElement apiLinkedUseCasesTab;

	@FindBy(xpath = "//nav[@class='nav-items']/a[6]")
	private WebElement apiTermsAndConditionsTab;

	@FindBy(xpath = "//nav[@class='nav-items']/a[7]")
	private WebElement apisupportTab;

	private By apiAssetName=By.xpath("//div[@class='details']//h2");
	
	private By apiSubscibed=By.xpath("//span[text()='Subscribed']");

	public void apiSubscriptionBySwagger() {
	    List<WebElement> subscribedElements = driver.findElements(apiSubscibed);

	    // If "Subscribed" chip is already visible
	    if (!subscribedElements.isEmpty() && subscribedElements.get(0).isDisplayed()) {
	        String actualText = subscribedElements.get(0).getText().trim();
	        Assert.assertEquals(actualText, "Subscribed", "API already subscribed");
	    } else {
	        // Not subscribed – click through Swagger flow
	        wait.until(ExpectedConditions.elementToBeClickable(apiExperienceForFree)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(apiExperienceOnSwagger)).click();

	        // Verify the "Subscribed" label is now visible
	        WebElement subscribed = wait.until(ExpectedConditions.visibilityOfElementLocated(apiSubscibed));
	        Assert.assertEquals(subscribed.getText().trim(), "Subscribed", "API subscription failed");
	    }
	}
	
	public void apiSubscriptionByPostman() {
	    List<WebElement> subscribedElements = driver.findElements(apiSubscibed);

	    // If "Subscribed" chip is already visible
	    if (!subscribedElements.isEmpty() && subscribedElements.get(0).isDisplayed()) {
	        String actualText = subscribedElements.get(0).getText().trim();
	        Assert.assertEquals(actualText, "Subscribed", "API already subscribed");
	    } else {
	        // Not subscribed – click through Swagger flow
	        wait.until(ExpectedConditions.elementToBeClickable(apiExperienceForFree)).click();
	        wait.until(ExpectedConditions.elementToBeClickable(apiExperienceOnPostman)).click();

	        // Verify the "Subscribed" label is now visible
	        WebElement subscribed = wait.until(ExpectedConditions.visibilityOfElementLocated(apiSubscibed));
	        Assert.assertEquals(subscribed.getText().trim(), "Subscribed", "API subscription failed");
	    }
	}
	
	public WebElement apiAssetNameOnDetailPage(String expectedApiName) {
		WebElement apiAssetNameElement =  wait.until(ExpectedConditions.visibilityOfElementLocated(apiAssetName));
	    
	    String actualText = driver.findElement(apiAssetName).getText().trim();
	    Assert.assertEquals(actualText, expectedApiName, "Incorrect API name on Asset Detail Page.");
	    
	    return apiAssetNameElement;  // or return the already located WebElement
	}



	public void clickapiAboutTab() {
		apiAboutTab.click();
	}

	public void clickapiDocumentationTab() {
		wait.until(ExpectedConditions.elementToBeClickable(apiDocumentationTab)).click();
	}

	public void clickapiFeaturesTab() {
		wait.until(ExpectedConditions.elementToBeClickable(apiFeaturesTab)).click();
	}

	public void clickapiLinkedUseCasesTab() {
		wait.until(ExpectedConditions.elementToBeClickable(apiLinkedUseCasesTab)).click();
	}

	public void clickapiTermsAndConditionsTab() {
		wait.until(ExpectedConditions.elementToBeClickable(apiTermsAndConditionsTab)).click();
	}

	public void clickapiSupportTab() {
		wait.until(ExpectedConditions.elementToBeClickable(apisupportTab)).click();
	}

}
