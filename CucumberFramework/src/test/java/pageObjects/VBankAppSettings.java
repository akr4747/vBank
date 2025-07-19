package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

	private By enterAppName = By.xpath("//input[@id='mat-input-0']");
	
	private By otherLanguage=By.xpath("//div[@class='mdc-evolution-chip-set__chips']");
	
	@FindBy(xpath="//span[contains(@class,'mdc-list-item__primary-text') and normalize-space(text())='Assamese (as)']")
	private WebElement assamLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-40']")
	private WebElement bengaliLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-41']")
	private WebElement bodoLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-42']")
	private WebElement dogriLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-43']")
	private WebElement gujratiLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-45']")
	private WebElement kannadaLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-46']")
	private WebElement kashmiriLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-47']")
	private WebElement konkaniLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-48']")
	private WebElement maithiliLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-49']")
	private WebElement malayalamLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-50']")
	private WebElement manipuriLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-51']")
	private WebElement marathiLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-52']")
	private WebElement nepaliLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-53']")
	private WebElement odiaLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-54']")
	private WebElement punjabiLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-55']")
	private WebElement sanskritLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-56']")
	private WebElement santaliLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-57']")
	private WebElement sindhiLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-58']")
	private WebElement tamilLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-59']")
	private WebElement teluguLanguage;
	
	@FindBy(xpath="//mat-option[@id='mat-option-60']")
	private WebElement urduLanguage;
	
	By effectiveDate= By.xpath("(//span[@class='mat-mdc-focus-indicator'])[1]");
//	private WebElement effectiveDate;

	@FindBy(xpath = "//span[contains(@class, 'mat-calendar-body-today')]")
	private WebElement currentEffectiveDate;

	@FindBy(xpath = "//button[.//span[text()='Next']]")
	private WebElement nextButton;

	public void enter_App_Name() {

		String apacheRandomString = generateApacheRandomString();
		driver.findElement(enterAppName).sendKeys(apacheRandomString);
	}
	
	public void clickOtherLanguage() {
	//	otherLanguage.click();
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(otherLanguage));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='listbox']")));
	}
	
	public void selectAssamLanguage() {
		boolean selectLanguage = assamLanguage.isSelected();
		if (selectLanguage == false) {
			assamLanguage.click();
		}
	}
	
	public void selectBengaliLanguage() {
		boolean selectLanguage = bengaliLanguage.isSelected();
		if (selectLanguage == false) {
			bengaliLanguage.click();
		}
	}

	public void selectBodoLanguage() {
		boolean selectLanguage = bodoLanguage.isSelected();
		if (selectLanguage == false) {
			bodoLanguage.click();
		}
	}

	public void selectDogriLanguage() {
		boolean selectLanguage = dogriLanguage.isSelected();
		if (selectLanguage == false) {
			dogriLanguage.click();
		}
	}

	public void selectGujratiLanguage() {
		boolean selectLanguage = gujratiLanguage.isSelected();
		if (selectLanguage == false) {
			gujratiLanguage.click();
		}
	}

	public void selectKannadaLanguage() {
		boolean selectLanguage = kannadaLanguage.isSelected();
		if (selectLanguage == false) {
			kannadaLanguage.click();
		}
	}

	public void selectKashmiriLanguage() {
		boolean selectLanguage = kashmiriLanguage.isSelected();
		if (selectLanguage == false) {
			kashmiriLanguage.click();
		}
	}

	public void selectKonkaniLanguage() {
		boolean selectLanguage = konkaniLanguage.isSelected();
		if (selectLanguage == false) {
			konkaniLanguage.click();
		}
	}

	public void selectMaithiliLanguage() {
		boolean selectLanguage = maithiliLanguage.isSelected();
		if (selectLanguage == false) {
			maithiliLanguage.click();
		}
	}

	public void selectMalayalamLanguage() {
		boolean selectLanguage = malayalamLanguage.isSelected();
		if (selectLanguage == false) {
			malayalamLanguage.click();
		}
	}

	public void selectManipuriLanguage() {
		boolean selectLanguage = manipuriLanguage.isSelected();
		if (selectLanguage == false) {
			manipuriLanguage.click();
		}
	}

	public void selectMarathiLanguage() {
		boolean selectLanguage = marathiLanguage.isSelected();
		if (selectLanguage == false) {
			marathiLanguage.click();
		}
	}

	public void selectNepaliLanguage() {
		boolean selectLanguage = nepaliLanguage.isSelected();
		if (selectLanguage == false) {
			nepaliLanguage.click();
		}
	}

	public void selectodiaLanguage() {
		boolean selectLanguage = odiaLanguage.isSelected();
		if (selectLanguage == false) {
			odiaLanguage.click();
		}
	}

	public void selectPunjabiLanguage() {
		boolean selectLanguage = punjabiLanguage.isSelected();
		if (selectLanguage == false) {
			punjabiLanguage.click();
		}
	}

	public void selectsanskritLanguage() {
		boolean selectLanguage = sanskritLanguage.isSelected();
		if (selectLanguage == false) {
			sanskritLanguage.click();
		}
	}

	public void selectSantaliLanguage() {
		boolean selectLanguage = santaliLanguage.isSelected();
		if (selectLanguage == false) {
			santaliLanguage.click();
		}
	}

	public void selectSindhiLanguage() {
		boolean selectLanguage = sindhiLanguage.isSelected();
		if (selectLanguage == false) {
			sindhiLanguage.click();
		}
	}

	public void selectTamilLanguage() {
		boolean selectLanguage = tamilLanguage.isSelected();
		if (selectLanguage == false) {
			tamilLanguage.click();
		}
	}

	public void selectTeluguLanguage() {
		boolean selectLanguage = teluguLanguage.isSelected();
		if (selectLanguage == false) {
			teluguLanguage.click();
		}
	}

	public void selectUrduLanguage() {
		boolean selectLanguage = urduLanguage.isSelected();
		if (selectLanguage == false) {
			urduLanguage.click();
		}
	}

	public void effective_Date() {
		  driver.findElement(effectiveDate).click();
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
