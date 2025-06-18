package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VBankLandingPage {
	
public WebDriver driver;
	
	public VBankLandingPage(WebDriver driver)
	{
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='add-new']")
	private  WebElement createNewApp;
	
	public void create_New_App() {
		createNewApp.click();
	}
}
