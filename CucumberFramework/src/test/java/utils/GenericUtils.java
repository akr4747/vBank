package utils;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.netty.handler.timeout.TimeoutException;

public class GenericUtils {
	public WebDriver driver;
	public WebDriverWait wait;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	}

	public void SwitchWindowToChild() {
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}

	public void SwitchWindowToChildToChild() {
		 String original = driver.getWindowHandle();

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		    wait.until(driver -> driver.getWindowHandles().size() >= 3);

		    Set<String> allWindows = driver.getWindowHandles();
		    for (String window : allWindows) {
		        if (!window.equals(original)) {
		            driver.switchTo().window(window);
		        }
		    }
		}
	
	public void SwitchWindowToLastOpened() {
	    Set<String> windows = driver.getWindowHandles();
	    for (String window : windows) {
	        driver.switchTo().window(window);
	    }
	}
	
	public void scrollAndClick(WebElement element) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    // Scroll the element into view
	    js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);

	    // Wait until element is clickable
	    wait.until(ExpectedConditions.elementToBeClickable(element));

	    // Click using JavaScript
	    js.executeScript("arguments[0].click();", element);
	}
	
	// Assert that the element is visible
	public void assertFormTitleVisible(By locator) {
	    wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); 
        String actualText = driver.findElement(locator).getText().trim();
        Assert.assertEquals(actualText, "Filter By", "'Filter panel' is visible but expected.");
//      Assert.assertTrue(driver.findElement(locator).isDisplayed(), "'form-title' is not visible but expected.");

	}

	// Assert that the element is NOT visible
	public void assertFormTitleNotVisible(By locator) {
	    try {
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
	    } catch (TimeoutException e) {
	        Assert.fail("'Filter panel' is not visible.");
	    }
	}

}
