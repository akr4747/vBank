package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VBankPublishApp {

	public WebDriver driver;
	
	public VBankPublishApp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input[placeholder='Enter Release Name']")
	private WebElement publishReleaseName;
	
	@FindBy(css = "input[placeholder='Enter Release Comment']")
	private  WebElement publish_Comment;
	
	@FindBy(xpath="//button[.//span[text()='Publish to Sandbox']]")
	private WebElement publishToSandbox;
	
	@FindBy(xpath="//button[.//span[text()=' Yes, Publish ']]")
	private WebElement yesPublish;
	
	@FindBy(xpath="//p[text()='Your App has been successfully Published to Sandbox.']")
	private WebElement successMsg;
	
	
	public void publish_Release_Name(String releaseName) {
		
		publishReleaseName.sendKeys(releaseName); 
	}
	
	public void publish_Comment(String comment) {
		
		publish_Comment.sendKeys(comment);
	}
	
	public void publish_To_Sandbox() {
		publishToSandbox.click();
	}
	
	public void yes_Publish() {
		
		yesPublish.click();
	}
	
	public String success_Msg() {
		return successMsg.getText();
	}
}
