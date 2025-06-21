package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VBankLandingPage {

	public WebDriver driver;

	public VBankLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='add-new']")
	private WebElement createNewApp;
	
	@FindBy(xpath= "(//span[@class='mdc-button__label'])[1]")
	private  WebElement viewInsights;

	public void create_New_App() {
		createNewApp.click();
	}
	
	public void clickViewInsights() {
		 viewInsights.click();
	}
}
