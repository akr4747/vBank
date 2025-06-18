package pageObjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventAndTagsPage {

	
public WebDriver driver;
	
	public EventAndTagsPage(WebDriver driver)
	{
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath="//a[@id='tab2']")
	 private WebElement event_tags;
	
	 @FindBy(linkText = "Add")
	 private WebElement add_button;
	 
	 @FindBy(xpath="(//input[@id='messagingSetName'])[1]")
	 private WebElement event_name;
	 
	 @FindBy(xpath="//input[@id='event_start_date']")
	 private WebElement event_start_date;
	 
	 @FindBy(xpath="//input[@id='event_end_date']")
	 private WebElement event_end_date;
	
	 @FindBy(xpath="//input[@id='event_start_time']")
	 private WebElement event_start_time;
	 
	 @FindBy(xpath="//input[@id='event_end_time']")
	 private WebElement event_end_time;
	 
	 @FindBy(xpath="//input[@id='testing_window_start_date']")
	 private WebElement testing_window_start_date;
	 
	 @FindBy(xpath="//input[@id='testing_window_end_date']")
	 private WebElement testing_window_end_date;
	 
	 @FindBy(xpath="//input[@id='testing_window_start_time']")
	 private WebElement testing_window_start_time;
	 
	 @FindBy(xpath="//input[@id='testing_window_end_time']")
	 private WebElement testing_window_end_time;
	 
	 @FindBy(xpath="//input[@name='location']")
	 private WebElement physical_location;
	 
	 @FindBy(xpath="//input[@name='event_url']")
	 private WebElement event_url;
	 
	 
	 public void eventName(String enterEventName) {
		 event_name.sendKeys(enterEventName);
	 }
	 
	 public void eventStartDate() {
		 event_start_date.click();
		 
		 LocalDate today = LocalDate.now(); 
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		 String formattedDate = today.format(formatter);
		 
	 }
	 
}
