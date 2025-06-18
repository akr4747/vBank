package pageObjects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateUserAndRolesPage {
	public WebDriver driver;
	
	public CreateUserAndRolesPage(WebDriver driver)
	{
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Users & Roles")
    private WebElement users_And_Roles;
	
	@FindBy(xpath = "//a[@href='accountuser.php?create_admin=2&accountid=42&mode=add' and contains(@class, 'btn btn-primary')]")
	private WebElement add_Button;
	
	@FindBy(xpath="//input[@class='form-control check_space_key']")
	private WebElement new_User_Name;
	
	@FindBy(xpath = "//input[@name='phone_number']")
	private WebElement phone;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//select[@id='userRole']")
	private WebElement user_Roles;
	
	@FindBy(xpath="//select[@id='role']")
	private WebElement user_Type;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement save_Button;
	
	public void userAndRoles() {
		users_And_Roles.click();
	}
	
	public void addButton() {
		add_Button.click();
	}
	
	public void newUserName(String userName) {
		new_User_Name.sendKeys(userName);
	}
	
	public void userPhone(String enterPhone) {
		phone.sendKeys(enterPhone);
	}
	
	public void userEmail(){
		email.click();
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		email.sendKeys("username"+ randomInt +"@gmail.com");
	}
	
	public void userRole() {
		
		Select se=new Select(user_Roles);
		se.selectByValue("1");
	}
	
	public void userType() {
		Select se=new Select(user_Type);
		se.selectByValue("2");
	}
	
	public void saveButton() {
		
		WebElement actionButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", actionButton);
	
	}
	
}
