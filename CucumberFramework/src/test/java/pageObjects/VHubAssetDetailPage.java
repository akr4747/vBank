package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.netty.handler.timeout.TimeoutException;

public class VHubAssetDetailPage {

	public WebDriver driver;
	public WebDriverWait wait;

	public VHubAssetDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@FindBy(xpath="//h2[text()='vConsent']")
	private WebElement asset_Name;
	
	@FindBy(xpath = "(//span[text()='Experience For Free'])[1]")
	private WebElement exprience_For_Free;

	@FindBy(xpath = "//button[contains(@class, 'mdc-button') and .//span[normalize-space(text())='Configure App']]")
	private WebElement configureApp;
	
	@FindBy(xpath = "//nav[contains(@class, 'nav-items')]//a[normalize-space(text())='About']")
	private  WebElement  aboutTab;
	
	@FindBy(xpath = "//nav[contains(@class, 'nav-items')]//a[normalize-space(text())=\"What's Included\"]")
	private WebElement whatsIncludedTab;
	
	@FindBy(xpath = "//nav[contains(@class, 'nav-items')]//a[normalize-space(text())='Linked Use Cases']")
	private WebElement linkedUseCasesTab;
	
	@FindBy(xpath ="//nav[contains(@class, 'nav-items')]//a[normalize-space(text())='Terms & Conditions']")
    private  WebElement termsConditionsTab;
	
	@FindBy(xpath= "//nav[contains(@class, 'nav-items')]//a[normalize-space(text())='Support']")
	private WebElement supportTab;
	
	private By assetDetailsText= By.xpath("//span[@class='highlight']");
	
	private By appAssetName=By.xpath("//div[@class='details']//h2");

	public boolean clickExperienceOrConfigureApp() {
	    int attempts = 0;
	    while (attempts < 2) {
	        try {
	            // Re-locate inside the loop to avoid stale reference
	            List<WebElement> experienceButtons = driver.findElements(
	                    By.xpath("(//button[.//span[normalize-space(text())='Experience For Free']])[1]"));

	            if (!experienceButtons.isEmpty() && experienceButtons.get(0).isDisplayed()) {
	                experienceButtons.get(0).click();
	                System.out.println("Clicked on 'Experience For Free' button.");

	                // Wait for auto-redirection (new tab opened)
	                WebDriverWait tempWait = new WebDriverWait(driver, Duration.ofSeconds(10));
	                tempWait.until(d -> d.getWindowHandles().size() > 1);

	                return false; // No manual switch needed
	            }
	            break; // exit if not found
	        } catch (StaleElementReferenceException e) {
	//            System.out.println("StaleElementReferenceException caught. Retrying attempt " + (attempts + 1));
	            attempts++;
	        } catch (Exception e) {
	//            System.out.println("Error clicking 'Experience For Free': " + e.getMessage());
	            break;
	        }
	    }

	    // Fallback: Try clicking "Configure App"
	    try {
	        WebElement configureAppButton = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//button[.//span[normalize-space(text())='Configure App']]")));
	        configureAppButton.click();
	        
	        return true; // Manual switch required
	    } catch (Exception e) {
	        throw new RuntimeException("Neither 'Experience For Free' nor 'Configure App' buttons could be clicked.", e);
	    }
	}
	

	public boolean isSearchResultDisplayed() {
		try {
			WebElement result = wait.until(ExpectedConditions.visibilityOf(asset_Name));
			return result.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickAboutTab() {
		aboutTab.click();
	}
	
	public void ClickWhatsIncludedTab() {
		whatsIncludedTab.click();
	}

	public void clicklinkedUseCasesTab() {
		linkedUseCasesTab.click();
	}
	
	public void clickTermsConditionsTab() {
		termsConditionsTab.click();
	}
	
	public void clickSupportTab() {
		supportTab.click();
	}

	public WebElement userInOnAssetDetailPage(String expectedAppName) {
		WebElement appAssetNameElement =  wait.until(ExpectedConditions.visibilityOfElementLocated(appAssetName));
	    
	    String actualText = driver.findElement(appAssetName).getText().trim();
	    Assert.assertEquals(actualText, expectedAppName, "Incorrect APP name on Asset Detail Page.");    
	    return appAssetNameElement;  // or return the already located WebElement
	}
	
	public void assetDetailsText() {
		
		 wait.until(ExpectedConditions.visibilityOfElementLocated(assetDetailsText));
         String actualText = driver.findElement(assetDetailsText).getText().trim();
         Assert.assertEquals(actualText, "Asset Details", "Asset Details text mismatch.");
	}
}
