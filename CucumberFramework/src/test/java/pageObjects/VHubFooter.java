package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.GenericUtils;

public class VHubFooter extends GenericUtils {
	
	public WebDriver driver;
	public WebDriverWait wait;
	GenericUtils utils;
	
	public VHubFooter(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	@FindBy(xpath="//a[@class='footer-2-header']")
	private WebElement becomePartner;
	
	@FindBy(xpath="//div[@class='heading-class']/h1")
	private WebElement partnerOnboarding;
	
	@FindBy(linkText="Decimal Technologies")
	private WebElement decimalTechnologies;
	
	@FindBy(linkText="Vahana Cloud")
	private WebElement vahanaCloud;
	
	@FindBy(linkText="Contact Us")
	private WebElement contactUs;
	
	@FindBy(linkText="Documentation")
	private WebElement documentation;
	
	@FindBy(linkText="Vahana Community")
	private WebElement vahanaCommunity;
	
	@FindBy(linkText="Vahana Hub Support")
	private WebElement vahanaHubSupport;
	
	@FindBy(xpath="//div[@class='cdk-overlay-container']/div")
	private WebElement vahanaHubSupportText;
	
	@FindBy(xpath="(//div[@class='footer-link-3'])[3]/a[1]")
	private WebElement linkedId;
	
	@FindBy(xpath="(//div[@class='footer-link-3'])[3]/a[2]")
	private WebElement youTube;
	
	public void clickOnBecomeAPartner() {
		scrollAndClick(becomePartner);
	}

	public void verifyOnBoardingPage() {
		String actualResult = wait.until(ExpectedConditions.visibilityOf(partnerOnboarding)).getText();
		Assert.assertEquals(actualResult, "Ready to become a Vahana Hub Partner?", "Incorrect redirect");
	}
	
	public void clickOnDecimalTechnology() {
		scrollAndClick(decimalTechnologies);
	}
	
	public void verifyDecimalTechnologyLink() {
		String currectURL=driver.getCurrentUrl();
		Assert.assertEquals(currectURL, "https://decimaltech.com/", "Incorrect URL");
	}
	
	public void clickVahanaCloud() {
		scrollAndClick(vahanaCloud);
	}
	
	public void verifyVahanaCloudLink() {
		String actualResult=driver.getCurrentUrl();
		Assert.assertEquals(actualResult, "https://decimaltech.com/vahana-cloud-platform/", "Incorrect URL");
	}
	
	public void clickContactUs() {
		scrollAndClick(contactUs);
	}
	
	public void verifyContactUsLink() {
		String actualResult=driver.getCurrentUrl();
		Assert.assertEquals(actualResult, "https://decimaltech.com/contact-us/", "Incorrect URL");
	}
	
	public void clickDocumentation() {
		scrollAndClick(documentation);
	}
	
	public void verifyDocumentationLink() {
		String actualResult=driver.getCurrentUrl();
		Assert.assertEquals(actualResult, "https://academy.vahanacloud.com/category/integration/vhub/", "Incorrect URL");
	}
	
	public void clickVahanaCommunity() {
		scrollAndClick(vahanaCommunity);
	}
	
	public void verifyVahanCommunityLink() {
		String actualResult=driver.getCurrentUrl();
		Assert.assertEquals(actualResult, "https://community.vahanacloud.com/c/vahanahub/17", "Incorrect URL");
	}
	
	public void clickHubSupport() {
		scrollAndClick(vahanaHubSupport);
	}
	
	public void verifyHubSupportText() {
		String actualMsg=wait.until(ExpectedConditions.visibilityOf(vahanaHubSupportText)).getText();
		String cleanText= actualMsg.split("OK")[0].trim();
		Assert.assertEquals(cleanText, "Email Copied successfully!", "Incorrect toast msg");
	}
	
	public void clickLinkeIn() {
		scrollAndClick(linkedId);
	}
	
	public void verifyLinkInLink() {
		String currentURL=driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("linkedin.com"), "LinkedIn URL is incorrect: " + currentURL);
	}
	
	public void clickYoutube() {
		scrollAndClick(youTube);
	}
	
	public void verifyYouTubeLink() {
		String currentURL=driver.getCurrentUrl();
		Assert.assertTrue(currentURL.contains("https://www.youtube.com/@decimaltech"), "Youtube URL is incorrect: " + currentURL);
	}
	

}
