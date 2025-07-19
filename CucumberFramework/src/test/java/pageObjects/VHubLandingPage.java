package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.GenericUtils;

public class VHubLandingPage extends GenericUtils{

	public WebDriver driver;
	public WebDriverWait wait;
	 GenericUtils utils;

	public VHubLandingPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		this.utils = new GenericUtils(driver);
	}

	private By loginButton = By.xpath("//button[.//span[contains(text(), 'Login')]]");

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
	
	private By clickOnvConsentCard = By.xpath("//div[@title='vConsent']");

	private By clickOnAPICard=By.xpath("(//div[@class='mktplc-card_header-title tite-pos'])[1]");
	
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
	
	@FindBy(xpath="//button//span[@class='mat-mdc-menu-item-text']")
	private WebElement vHublogout;
	
	private By exploreUseCaseButton = By.xpath("//div[@class='explore-btn']//button");
	
	private By trendingText=By.xpath("//*[normalize-space(.)='Trending']");
	
	private By featuredText=By.xpath("//*[normalize-space(.)='Featured']");
	
	private By mostPopularText=By.xpath("//*[normalize-space(.)='Most Popular']");

	private By topUseCasesText=By.xpath("//*[normalize-space(.)='Top Use Cases']");
	
	private By topPartnersText = By.xpath("//div[@class='sort-div']");
	
	private By filterTitle = By.xpath("//span[@class='form-title']");
	
	// Explore All buttons
	
	@FindBy(xpath="(//div[@class='product-section_heading']//button//span[@class='mdc-button__label'])[1]")
	private WebElement exploreAllTrending;
	
	@FindBy(xpath="(//div[@class='product-section_heading']//button//span[@class='mdc-button__label'])[2]")
	private WebElement exploreAllFeatured;
	
	@FindBy(xpath="(//div[@class='product-section_heading']//button//span[@class='mdc-button__label'])[3]")
	private WebElement exploreAllMostPopular;
	
	@FindBy(xpath="(//div[@class='product-section_heading']//button//span[@class='mdc-button__label'])[4]")
	private WebElement exploreAllTopUseCases;
	
	@FindBy(xpath="(//div[@class='product-section_heading']//button//span[@class='mdc-button__label'])[5]")
	private WebElement exploreAllTopPartners;

	// ------Login Methods------

	public void login_SignUp_Button() {
		 driver.findElement(loginButton).click();
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
	
	public void clickVHubLogout() {
		wait.until(ExpectedConditions.elementToBeClickable(vHublogout)).click();
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
	
	public void click_On_vConsent_Card(String assetName) {
		By assetCard = By.xpath("//div[@title='" + assetName + "']");
	    WebElement card = wait.until(ExpectedConditions.elementToBeClickable(assetCard));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", card);

	}
	
	public void click_On_API_Card(String apiName) {		
		 By apiCard = By.xpath("//div[normalize-space(@title)='" + apiName + "']");
		    WebElement apiAsset = wait.until(ExpectedConditions.elementToBeClickable(apiCard));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", apiAsset);
		}
	
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
	
	public void vHubloginButton() {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
         String actualText = driver.findElement(loginButton).getText().trim();
         Assert.assertEquals(actualText, "Login", "Login button text mismatch.");
		
	}
	
	// Explore All
	
	public void clickExploreAllTrending() {
		exploreAllTrending.click();
	}
	
	public void clickExploreAllFeatured() {
		scrollAndClick(exploreAllFeatured);
	}
	
	public void clickExploreAllMostPopular() {
	//	exploreAllMostPopular.click();
		scrollAndClick(exploreAllMostPopular);
	}
	
	public void clickExploreAllTopUseCases() {
		scrollAndClick(exploreAllTopUseCases);
	}
		
	public void clickExploreAllTopPartners() {
		scrollAndClick(exploreAllTopPartners);
	}
	
	// 
	
	public void exploreUseCaseText() {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCaseButton));
         String actualText = driver.findElement(exploreUseCaseButton).getText().trim();
         Assert.assertEquals(actualText, "Explore Use Cases", "Explore Use Cases button text mismatch.");
	}
 
	public void trendingLabel() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(trendingText));
        String actualText = driver.findElement(trendingText).getText().trim();
        Assert.assertEquals(actualText, "Trending", "Trending Label text mismatch.");
        
        utils.assertFormTitleVisible(filterTitle); // Filter title should be visible
	}
	
	public void featuredLabel() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(featuredText));
        String actualText = driver.findElement(featuredText).getText().trim();
        Assert.assertEquals(actualText, "Featured", "Featured Label text mismatch.");
        
        utils.assertFormTitleVisible(filterTitle); // Filter title should be visible
	}
	
	public void mostPopularLabel() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(mostPopularText));
        String actualText = driver.findElement(mostPopularText).getText().trim();
        Assert.assertEquals(actualText, "Most Popular", "Most Popular Label text mismatch.");
        
        utils.assertFormTitleVisible(filterTitle); // Filter title should be visible
	}
	
	public void topUseCasesLabel() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(topUseCasesText));
        String actualText = driver.findElement(topUseCasesText).getText().trim();
        Assert.assertEquals(actualText, "Top Use Cases", "Top Use Cases Label text mismatch.");
        
        utils.assertFormTitleNotVisible(filterTitle); // Filter title should not be visible
	}
	
	public void topPartnersLabel() {
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(topPartnersText));
	    String actualText = element.getText().trim();
	    String cleanedText = actualText.split("Sort By")[0].trim();
	    Assert.assertEquals(cleanedText, "Top Partners", "Top Partners label mismatch.");
	    
	    utils.assertFormTitleNotVisible(filterTitle); // Filter title should not be visible
	}


}
