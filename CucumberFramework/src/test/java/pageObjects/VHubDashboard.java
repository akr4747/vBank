package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VHubDashboard {
	
	
	public WebDriver driver;
	public WebDriverWait wait;

	public VHubDashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	@FindBy(xpath="//a[@routerlink='subscriptions']")
	private WebElement subscriptions;

	public void clickSubscriptions() {
		subscriptions.click();
	}

}
