package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VHubLandingPage {

	public WebDriver driver;
	public WebDriverWait wait;

	public VHubLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	@FindBy(xpath = "//button[.//span[contains(text(), 'Login')]]")
	private WebElement loginButton;

	@FindBy(xpath = "//input[@id='mat-input-1']")
	private WebElement enterEmail;

	@FindBy(xpath = "//input[@id='mat-input-2']")
	private WebElement enterPassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement clickLogin;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement search_text_box;

	@FindBy(xpath = "//input[@type='search']")
	private WebElement searchBox;
	
	By clickOnvConsentCard = By.xpath("//div[@title='vConsent']");

	@FindBy(xpath = "//span[text()='Explore Use Cases']")
	private WebElement explore_Use_Case;

	@FindBy(css = "div.category-head")
	private WebElement title_Top_Use_Cases;

	@FindBy(xpath = "//img[contains(@src, '/assets/images/menu.svg')]")
	private WebElement hambergen_Icon;

	@FindBy(xpath = "//div[@class='menu-container ng-tns-c1923052698-0']")
	private WebElement developer_Console;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-trigger help-icon']")
	private WebElement question_Mark;

	@FindBy(xpath = "(//a[@rel='noopener noreferrer'])[1]")
	private WebElement documentation_Link;

	@FindBy(xpath = "(//a[@rel='noopener noreferrer'])[2]")
	private WebElement vahana_Community;
	
	@FindBy(xpath="//div[@class='profile-details']")
	private WebElement profileDetails;
	
	@FindBy(xpath="//a[@routerlink='/ManageAccount/AccountDetails']")
	private WebElement accountSettings;

	// ------Login Methods------

	public void login_SignUp_Button() {
		loginButton.click();
	}

	public void enter_User_Email(String userName) {
		enterEmail.sendKeys(userName);
	}

	public void enter_User_Password(String userPwd) {
		enterPassword.sendKeys(userPwd);
	}

	public void click_Login_Button() {
		clickLogin.click();
	}

	// --------- Search Methods ---------

	public void searchTextBox() {

		search_text_box.click();
	}

	public void enterAssetNameOnSearchBox(String assetName) {
		search_text_box.sendKeys(assetName);
	}

	public void hitEnter() {

		search_text_box.sendKeys(Keys.ENTER);
	}

	public void sendEscapeKeyToSearchBox() {
		searchBox.sendKeys(Keys.ESCAPE);
	}
	
	public void click_On_vConsent_Card() {
		
		WebElement clickOnCard = wait.until(ExpectedConditions.elementToBeClickable(clickOnvConsentCard));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickOnCard);
	}
	
/*	public void click_On_vConsent_Card() {
	    By consentCardLocator = By.xpath("//div[@title='vConsent']");
	    for (int attempt = 0; attempt < 2; attempt++) {
	        try {
	            WebElement clickOnCard = wait.until(ExpectedConditions.elementToBeClickable(consentCardLocator));
	            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickOnCard);
	            break;
	        } catch (StaleElementReferenceException e) {
	            System.out.println("Stale element encountered. Retrying...");
	        }
	    }
	} */
	
	public boolean isSearchBoxVisible() {
		try {
			wait.until(ExpectedConditions.visibilityOf(search_text_box));
			return search_text_box.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	
	// --------- Explore Use Case Section ---------

	public void exploreUseCases() {
		explore_Use_Case.click();
	}

	public String exploreUseCasesText() {
		return explore_Use_Case.getText();
	}

	public String titleTopUseCases() {
//		return title_Top_Use_Cases.getText();
		String fullText = title_Top_Use_Cases.getText();
		// If text includes "Sort By", extract only "Top Use Cases"
		return fullText.split("Sort By")[0].trim();
	}
	
	public void waitForExploreUseCasesVisible() {
	    wait.until(ExpectedConditions.visibilityOf(explore_Use_Case));
	}

	public void waitForTopUseCasesVisible() {
	    wait.until(ExpectedConditions.visibilityOf(title_Top_Use_Cases));
	}

	// --------- Navigation Links ---------

	public void hambergenIcon() {
		wait.until(ExpectedConditions.elementToBeClickable(hambergen_Icon)).click();
	}

	public void developerConsole() {
		wait.until(ExpectedConditions.elementToBeClickable(developer_Console)).click();
	}

	public void questionMark() {
		question_Mark.click();
	}

	public void documentationLink() {
		documentation_Link.click();
	}

	public void vahanaCommunity() {
		vahana_Community.click();
	}
	

	public void waitForQuestionMark() {
		WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='mat-mdc-menu-trigger help-icon']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextButton);
		

	}

	public void waitForVahanaAccountPageHeader() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Get Started with Vahana']")));
	}

	public void clickQuestionMarkAndOpenDocumentation() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", question_Mark);
		wait.until(ExpectedConditions.elementToBeClickable(documentation_Link)).click();
	}

	public void clickQuestionMarkAndOpenCommunity() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", question_Mark);
		wait.until(ExpectedConditions.elementToBeClickable(vahana_Community)).click();
	}
	
	public void clickProfileDetails() {
		profileDetails.click();
	}
		
	public void clickAccountSettings() {
		wait.until(ExpectedConditions.elementToBeClickable(accountSettings)).click();
	}
 

}
