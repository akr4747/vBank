package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VBankConsentConfiguration {

	public WebDriver driver;
	public WebDriverWait wait;

	public VBankConsentConfiguration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	@FindBy(xpath = "(//span[@class='mdc-button__label'])[3]")
	private WebElement addNewConsentButton;

	By enterConsentName = By.cssSelector("input[placeholder='Enter Consent Name']");
	
	@FindBy(xpath="//textarea[@formcontrolname='description']")
	private WebElement consent_Description;
	
	@FindBy(xpath="(//span[@class='text-100-s'])[2]")
	private WebElement addLanguage;
	
	@FindBy(xpath="//input[@formcontrolname='audio']")
	private  WebElement  consent_Audio;
	
	@FindBy(xpath="//input[@formcontrolname='video']")
	private WebElement consent_Video;

	@FindBy(xpath = "//label[contains(text(),'Consent Notice Text')]/following::div[contains(@class,'ql-editor')][1]")
	private WebElement enterConsentNotice;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 2')]/following::mat-select)[1]")
	private WebElement consentLanguage2;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 3')]/following::mat-select)[1]")
	private WebElement consentLanguage3;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 4')]/following::mat-select)[1]")
	private WebElement consentLanguage4;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 5')]/following::mat-select)[1]")
	private WebElement consentLanguage5;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 6')]/following::mat-select)[1]")
	private WebElement consentLanguage6;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 7')]/following::mat-select)[1]")
	private WebElement consentLanguage7;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 8')]/following::mat-select)[1]")
	private WebElement consentLanguage8;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 9')]/following::mat-select)[1]")
	private WebElement consentLanguage9;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 10')]/following::mat-select)[1]")
	private WebElement consentLanguage10;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 11')]/following::mat-select)[1]")
	private WebElement consentLanguage11;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 12')]/following::mat-select)[1]")
	private WebElement consentLanguage12;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 13')]/following::mat-select)[1]")
	private WebElement consentLanguage13;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 14')]/following::mat-select)[1]")
	private WebElement consentLanguage14;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 15')]/following::mat-select)[1]")
	private WebElement consentLanguage15;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 16')]/following::mat-select)[1]")
	private WebElement consentLanguage16;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 17')]/following::mat-select)[1]")
	private WebElement consentLanguage17;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 18')]/following::mat-select)[1]")
	private WebElement consentLanguage18;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 19')]/following::mat-select)[1]")
	private WebElement consentLanguage19;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 20')]/following::mat-select)[1]")
	private WebElement consentLanguage20;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 21')]/following::mat-select)[1]")
	private WebElement consentLanguage21;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 22')]/following::mat-select)[1]")
	private WebElement consentLanguage22;
	
	@FindBy(xpath="(//div[contains(text(),'Consent Notice Language 23')]/following::mat-select)[1]")
	private WebElement consentLanguage23;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[2]")
	private WebElement consentType2;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[3]")
	private WebElement consentType3;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[4]")
	private WebElement consentType4;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[5]")
	private WebElement consentType5;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[6]")
	private WebElement consentType6;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[7]")
	private WebElement consentType7;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[8]")
	private WebElement consentType8;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[9]")
	private WebElement consentType9;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[10]")
	private WebElement consentType10;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[11]")
	private WebElement consentType11;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[12]")
	private WebElement consentType12;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[13]")
	private WebElement consentType13;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[14]")
	private WebElement consentType14;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[15]")
	private WebElement consentType15;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[16]")
	private WebElement consentType16;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[17]")
	private WebElement consentType17;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[18]")
	private WebElement consentType18;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[19]")
	private WebElement consentType19;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[20]")
	private WebElement consentType20;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[21]")
	private WebElement consentType21;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[22]")
	private WebElement consentType22;
	
	@FindBy(xpath="(//mat-select[@placeholder='Select Option' and @formcontrolname='consentType'])[23]")
	private WebElement consentType23;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[1]")
	private WebElement enterConsentNotice2;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[2]")
	private WebElement enterConsentNotice3;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[3]")
	private WebElement enterConsentNotice4;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[4]")
	private WebElement enterConsentNotice5;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[5]")
	private WebElement enterConsentNotice6;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[6]")
	private WebElement enterConsentNotice7;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[7]")
	private WebElement enterConsentNotice8;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[8]")
	private WebElement enterConsentNotice9;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[9]")
	private WebElement enterConsentNotice10;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[10]")
	private WebElement enterConsentNotice11;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[11]")
	private WebElement enterConsentNotice12;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[12]")
	private WebElement enterConsentNotice13;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[13]")
	private WebElement enterConsentNotice14;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[14]")
	private WebElement enterConsentNotice15;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[15]")
	private WebElement enterConsentNotice16;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[16]")
	private WebElement enterConsentNotice17;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[17]")
	private WebElement enterConsentNotice18;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[18]")
	private WebElement enterConsentNotice19;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[19]")
	private WebElement enterConsentNotice20;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[20]")
	private WebElement enterConsentNotice21;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[21]")
	private WebElement enterConsentNotice22;
	
	@FindBy(xpath="(//label[contains(text(),'Consent Notice Text')]/following::textarea)[22]")
	private WebElement enterConsentNotice23;

	@FindBy(xpath = "//button[.//span[text()=' Save ']]")
	private WebElement saveButton;

	@FindBy(xpath = "(//button//div[.//span[text()='Next']])[2]")
	private WebElement nextButton;

	public void add_New_Consent_Button() {
		wait.until(ExpectedConditions.elementToBeClickable(addNewConsentButton)).click();
	}

	public void enter_Consent_Name() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(enterConsentName));
		String apacheRandomString = generateApacheRandomString();
		driver.findElement(enterConsentName).sendKeys(apacheRandomString);
	}

	public void enterConsentDescription(String consentDescription) {
		consent_Description.sendKeys(consentDescription);
	}
	
	public void clickAddLanguage() {
		addLanguage.click();
	}
	
	public void clickAddLanguages() {
		  int maxClicks = 22;

		    for (int i = 0; i < maxClicks; i++) {
		        try {
		            wait.until(ExpectedConditions.elementToBeClickable(addLanguage)).click();
		        } catch (TimeoutException | NoSuchElementException | ElementClickInterceptedException e) {
		            // Button is no longer available or clickable, stop clicking
		            break;
		        }
		    }
		}
	
	public void enterConsentAudio(String consentAudio) {
		consent_Audio.sendKeys(consentAudio);
	}
	
	public void enterConsentVideo(String consentVideo) {
		consent_Video.sendKeys(consentVideo);
	}
	

	public void enter_Consent_Notice(String consentNotice) {
		enterConsentNotice.sendKeys(consentNotice);
	}
	
	public void enter_Consent_Notice1(String consentNotice) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    // Inject the content using JavaScript
	    js.executeScript("arguments[0].innerHTML = arguments[1];", enterConsentNotice, consentNotice);

	    // Optional: wait until the content is updated
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(d ->
	    enterConsentNotice.getAttribute("innerHTML").contains(consentNotice.substring(0, 20)) // partial match to avoid long full string
	    );
	}
	
	public void selectConsentLanguage2() {
		consentLanguage2.click();
		String language = "Assamese";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType2() {
		consentType2.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText2(String consentNotice2) {
	    enterConsentNotice2.clear();
	    enterConsentNotice2.sendKeys(consentNotice2);
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
	        ExpectedConditions.attributeToBe(enterConsentNotice2, "value", consentNotice2)
	    );
	}
		
	public void selectConsentLanguage3() {
		consentLanguage3.click();
		String language = "Bengali";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType3() {
		consentType3.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText3(String  consentNotice3) {
		 enterConsentNotice3.clear();
		    enterConsentNotice3.sendKeys(consentNotice3);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice3, "value", consentNotice3)
		    );
		}
	
	public void selectConsentLanguage4() {
		consentLanguage4.click();
		String language = "Bodo";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType4() {
		consentType4.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText4(String  consentNotice4) {
		 enterConsentNotice4.clear();
		    enterConsentNotice4.sendKeys(consentNotice4);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice4, "value", consentNotice4)
		    );
		}
	
	public void selectConsentLanguage5() {
		consentLanguage5.click();
		String language = "Dogri";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType5() {
		consentType5.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText5(String  consentNotice5) {
		 enterConsentNotice5.clear();
		    enterConsentNotice5.sendKeys(consentNotice5);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice5, "value", consentNotice5)
		    );
		}
	
	public void selectConsentLanguage6() {
		consentLanguage6.click();
		String language = "Gujarati";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType6() {
		consentType6.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText6(String  consentNotice6) {
		 enterConsentNotice6.clear();
		    enterConsentNotice6.sendKeys(consentNotice6);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice6, "value", consentNotice6)
		    );
		}
	
	public void selectConsentLanguage7() {
		consentLanguage7.click();
		String language = "Hindi";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType7() {
		consentType7.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText7(String  consentNotice7) {
		 enterConsentNotice7.clear();
		    enterConsentNotice7.sendKeys(consentNotice7);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice7, "value", consentNotice7)
		    );
		}
	
	public void selectConsentLanguage8() {
		consentLanguage8.click();
		String language = "Kannada";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType8() {
		consentType8.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText8(String  consentNotice8) {
		 enterConsentNotice8.clear();
		    enterConsentNotice8.sendKeys(consentNotice8);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice8, "value", consentNotice8)
		    );
		}
	
	public void selectConsentLanguage9() {
		consentLanguage9.click();
		String language = "Kashmiri";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType9() {
		consentType9.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText9(String  consentNotice9) {
		 enterConsentNotice9.clear();
		    enterConsentNotice9.sendKeys(consentNotice9);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice9, "value", consentNotice9)
		    );
		}
	
	public void selectConsentLanguage10() {
		consentLanguage10.click();
		String language = "Konkani";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType10() {
		consentType10.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText10(String  consentNotice10) {
		 enterConsentNotice10.clear();
		    enterConsentNotice10.sendKeys(consentNotice10);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice10, "value", consentNotice10)
		    );
		}
	
	public void selectConsentLanguage11() {
		consentLanguage11.click();
		String language = "Maithili";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType11() {
		consentType11.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText11(String  consentNotice11) {
		 enterConsentNotice11.clear();
		    enterConsentNotice11.sendKeys(consentNotice11);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice11, "value", consentNotice11)
		    );
		}
	
	public void selectConsentLanguage12() {
		consentLanguage12.click();
		String language = "Malayalam";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType12() {
		consentType12.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText12(String  consentNotice12) {
		 enterConsentNotice12.clear();
		    enterConsentNotice12.sendKeys(consentNotice12);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice12, "value", consentNotice12)
		    );
		}
	
	public void selectConsentLanguage13() {
		consentLanguage13.click();
		String language = "Manipuri";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType13() {
		consentType13.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText13(String  consentNotice13) {
		 enterConsentNotice13.clear();
		    enterConsentNotice13.sendKeys(consentNotice13);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice13, "value", consentNotice13)
		    );
		}
	
	public void selectConsentLanguage14() {
		consentLanguage14.click();
		String language = "Marathi";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType14() {
		consentType14.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText14(String  consentNotice14) {
		 enterConsentNotice14.clear();
		    enterConsentNotice14.sendKeys(consentNotice14);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice14, "value", consentNotice14)
		    );
		}
	
	public void selectConsentLanguage15() {
		consentLanguage15.click();
		String language = "Nepali";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType15() {
		consentType15.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText15(String  consentNotice15) {
		 enterConsentNotice15.clear();
		    enterConsentNotice15.sendKeys(consentNotice15);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice15, "value", consentNotice15)
		    );
		}
	
	public void selectConsentLanguage16() {
		consentLanguage16.click();
		String language = "Odia";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType16() {
		consentType16.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText16(String  consentNotice16) {
		 enterConsentNotice16.clear();
		    enterConsentNotice16.sendKeys(consentNotice16);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice16, "value", consentNotice16)
		    );
		}
	
	public void selectConsentLanguage17() {
		consentLanguage17.click();
		String language = "Punjabi";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType17() {
		consentType17.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText17(String  consentNotice17) {
		 enterConsentNotice17.clear();
		    enterConsentNotice17.sendKeys(consentNotice17);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice17, "value", consentNotice17)
		    );
		}
	
	public void selectConsentLanguage18() {
		consentLanguage18.click();
		String language = "Sanskrit";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType18() {
		consentType18.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText18(String  consentNotice18) {
		 enterConsentNotice18.clear();
		    enterConsentNotice18.sendKeys(consentNotice18);
		    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
		        ExpectedConditions.attributeToBe(enterConsentNotice18, "value", consentNotice18)
		    );
		}
	
	public void selectConsentLanguage19() {
		consentLanguage19.click();
		String language = "Santali";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType19() {
		consentType19.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText19(String  consentNotice19) {
		enterConsentNotice19.clear();
	    enterConsentNotice19.sendKeys(consentNotice19);
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
	        ExpectedConditions.attributeToBe(enterConsentNotice19, "value", consentNotice19)
	    );
	}
	
	public void selectConsentLanguage20() {
		consentLanguage20.click();
		String language = "Sindhi";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType20() {
		consentType20.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText20(String  consentNotice20) {
		enterConsentNotice20.clear();
	    enterConsentNotice20.sendKeys(consentNotice20);
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
	        ExpectedConditions.attributeToBe(enterConsentNotice20, "value", consentNotice20)
	    );
	}
	
	public void selectConsentLanguage21() {
		consentLanguage21.click();
		String language = "Tamil";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType21() {
		consentType21.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText21(String  consentNotice21) {
		enterConsentNotice21.clear();
	    enterConsentNotice21.sendKeys(consentNotice21);
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
	        ExpectedConditions.attributeToBe(enterConsentNotice21, "value", consentNotice21)
	    );
	}
	
	public void selectConsentLanguage22() {
		consentLanguage22.click();
		String language = "Telugu";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType22() {
		consentType22.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText22(String  consentNotice22) {
		enterConsentNotice22.clear();
	    enterConsentNotice22.sendKeys(consentNotice22);
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
	        ExpectedConditions.attributeToBe(enterConsentNotice22, "value", consentNotice22)
	    );
	}
	
	public void selectConsentLanguage23() {
		consentLanguage23.click();
		String language = "Urdu";
		By option = By.xpath("//span[contains(@class,'mdc-list-item__primary-text') and contains(text(),'" + language + "')]");
		wait.until(ExpectedConditions.elementToBeClickable(option)).click();
	}
	
	public void selectConsentType23() {
		consentType23.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-option")));
		List<WebElement> options = driver.findElements(By.xpath("//mat-option"));
		options.get(0).click();
	}
	
	public void enterConsentNoticeText23(String  consentNotice23) {
		enterConsentNotice23.clear();
	    enterConsentNotice23.sendKeys(consentNotice23);
	    new WebDriverWait(driver, Duration.ofSeconds(10)).until(
	        ExpectedConditions.attributeToBe(enterConsentNotice23, "value", consentNotice23)
	    );
	}
	

	public void save_Button() {
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
	}

	public void next_Button() {
		wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
	}
	

	// Utility

	private String generateApacheRandomString() {
		return RandomStringUtils.randomAlphanumeric(8);

	}
}
