package utils;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {
	public WebDriver driver;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;
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
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	    wait.until(ExpectedConditions.elementToBeClickable(element));

	    // Click using JavaScript
	    js.executeScript("arguments[0].click();", element);
	}

}
