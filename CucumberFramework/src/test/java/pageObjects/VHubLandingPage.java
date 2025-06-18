package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VHubLandingPage {

public WebDriver driver;
	
	public VHubLandingPage(WebDriver driver)
	{
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[.//span[contains(text(), 'Login')]]")
	private WebElement loginButton;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	private WebElement enterEmail;
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	private WebElement enterPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickLogin;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement search_text_box;
	
	@FindBy(xpath="//div[@title='vConsent']")
	private WebElement  clickOnvConsentCard;
	
	@FindBy(xpath="//span[text()='Explore Use Cases']")
	private WebElement explore_Use_Case;
	
	@FindBy(css="div.category-head")
	private WebElement title_Top_Use_Cases;
	
	@FindBy(xpath="//img[contains(@src, '/assets/images/menu.svg')]")
	private WebElement  hambergen_Icon;
	
	@FindBy(xpath="//div[@class='menu-container ng-tns-c1923052698-0']")
	private  WebElement developer_Console;
	
	@FindBy(xpath="//img[@alt='question']")
	private  WebElement question_Mark;
	
	@FindBy(xpath="(//a[@rel='noopener noreferrer'])[1]")
	private  WebElement documentation_Link;
	
	@FindBy(xpath="(//a[@rel='noopener noreferrer'])[2]")
	private  WebElement vahana_Community;
	
	@FindBy(xpath="//span[@class='user-name']")
	private WebElement user_Name;
	
	
	public void login_SignUp_Button() 
	{
		loginButton.click();
	}
	
	public void enter_User_Email(String userName)
	{
		enterEmail.sendKeys(userName);
	}
	
	public void enter_User_Password(String userPwd)
	{
		enterPassword.sendKeys(userPwd);
	}
	
	public void click_Login_Button() 
	{
		clickLogin.click();
	}
	
	public void searchTextBox() {
		
		search_text_box.click();
	}
	
	public void enterAssetNameOnSearchBox(String assetName)
	{
		search_text_box.sendKeys(assetName);
	}

	public void hitEnter() {
		
		search_text_box.sendKeys(Keys.ENTER);
	}
	
	public void click_On_vConsent_Card() {
		clickOnvConsentCard.click();
		
	}
	
	public void exploreUseCases() {
		explore_Use_Case.click();
	}
	
	public String titleTopUseCases() {
//		return title_Top_Use_Cases.getText();
	    String fullText = title_Top_Use_Cases.getText();
	    // If text includes "Sort By", extract only "Top Use Cases"
	    return fullText.split("Sort By")[0].trim();
	}
	
	public void hambergenIcon() {
		hambergen_Icon.click();
	}
	
	public void developerConsole() {
		developer_Console.click();
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
	
	public String userName() {
		return user_Name.getText();
	}
}
