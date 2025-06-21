package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VBankConsentConfiguration {

	public WebDriver driver;

	public VBankConsentConfiguration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='mdc-button__label'])[3]")
	private WebElement addNewConsentButton;

	By enterConsentName = By.cssSelector("input[placeholder='Enter Consent Name']");

	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	private WebElement enterConsentNotice;

	@FindBy(xpath = "//button[.//span[text()=' Save ']]")
	private WebElement saveButton;

	@FindBy(xpath = "(//button//div[.//span[text()='Next']])[2]")
	private WebElement nextButton;

	public void add_New_Consent_Button() {
		addNewConsentButton.click();
	}

	public void enter_Consent_Name() {
//		enterConsentName.sendKeys(consentName);

		String apacheRandomString = generateApacheRandomString();
		driver.findElement(enterConsentName).sendKeys(apacheRandomString);
	}

	public void enter_Consent_Notice(String consentNotice) {
		enterConsentNotice.sendKeys(consentNotice);
	}

	public void save_Button() {
		saveButton.click();
	}

	public void next_Button() {
		nextButton.click();
	}

	// Utility

	private String generateApacheRandomString() {
		return RandomStringUtils.randomAlphanumeric(8);

	}
}
