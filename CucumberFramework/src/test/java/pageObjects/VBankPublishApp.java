package pageObjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VBankPublishApp {

	public WebDriver driver;
	public WebDriverWait wait;

	public VBankPublishApp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	@FindBy(css = "input[placeholder='Enter Release Name']")
	private WebElement publishReleaseName;

	@FindBy(css = "input[placeholder='Enter Release Comment']")
	private WebElement publish_Comment;

	@FindBy(xpath = "//button[.//span[text()='Publish to Sandbox']]")
	private WebElement publishToSandbox;

	@FindBy(xpath = "//button[.//span[text()=' Yes, Publish ']]")
	private WebElement yesPublish;

	@FindBy(xpath = "//div[@class='popup-header']/h5")
	private WebElement successMsg;

	public void publish_Release_Name(String releaseName) {

		wait.until(ExpectedConditions.visibilityOf(publishReleaseName)).sendKeys(releaseName);
	}

	public void publish_Comment(String comment) {

		publish_Comment.sendKeys(comment);
	}

	public void publish_To_Sandbox() {
		publishToSandbox.click();
	}

	public void yes_Publish() {

		wait.until(ExpectedConditions.elementToBeClickable(yesPublish)).click();
	}

	public String success_Msg() {
		wait.until(ExpectedConditions.visibilityOf(successMsg));
		return successMsg.getText();
	}

}
