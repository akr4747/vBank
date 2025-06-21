package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.RandomStringUtils;

public class VBankAppSettings {

	public WebDriver driver;
	public WebDriverWait wait;

	public VBankAppSettings(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	By enterAppName = By.xpath("//input[@id='mat-input-0']");

	@FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[1]")
	private WebElement effectiveDate;

	@FindBy(xpath = "//span[contains(@class, 'mat-calendar-body-today')]")
	private WebElement currentEffectiveDate;

	@FindBy(xpath = "//button[.//span[text()='Next']]")
	private WebElement nextButton;

	public void enter_App_Name() {

		String apacheRandomString = generateApacheRandomString();
		driver.findElement(enterAppName).sendKeys(apacheRandomString);
	}

	public void effective_Date() {
		effectiveDate.click();

	}

	public void current_Effective_Date() {
		currentEffectiveDate.click();
	}

	public void next_Button() {
		nextButton.click();
	}
	
	public void waitForAppSettingsPageToLoad() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='App Settings']")));
	}
	
	public void waitForCalendarToAppear() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class, 'mat-calendar-body-today')]")));
	}
	

public void waitForNextButtonToBeClickable() {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
}

	// Utility

	private String generateApacheRandomString() {
		return RandomStringUtils.randomAlphanumeric(8);
	}
}
