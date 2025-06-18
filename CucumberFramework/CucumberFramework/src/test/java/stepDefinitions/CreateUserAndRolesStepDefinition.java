package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateAccountPage;
import pageObjects.CreateUserAndRolesPage;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class CreateUserAndRolesStepDefinition {

	
	TestContextSetup testContextSetup;
	CreateAccountPage createAccountPage;
	LoginPage loginPage;
	CreateUserAndRolesPage createUserAndRolesPage;
	WebDriverWait wait;
	
	
	public CreateUserAndRolesStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.createUserAndRolesPage =testContextSetup.pageObjectManager.getCreateUserAndRolesPage();
		this.loginPage =testContextSetup.pageObjectManager.getLoginPage();
		this.wait = new WebDriverWait(createUserAndRolesPage.driver, Duration.ofSeconds(2)); 
	}
	
		@Given("user navigates to the Dashboard to create a new user and roles")
		public void user_navigates_to_the_dashboard_to_create_a_new_user_and_roles() throws InterruptedException {
		
			loginPage.selectSearchButton();
			
			WebElement visibleAllAccounts=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='accountsTable']")));
			
			loginPage.selectMoinAccount();
			
			
		}
		@When("^user fills all the mandatory fields username (.+) and phone (.+) with correct values$")
		public void user_fills_all_the_mandatory_fields_username_username_and_phone_with_correct_values(String userName, String phone) throws InterruptedException {
			

			WebElement userRoleTab=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Users & Roles")));
			
			createUserAndRolesPage.userAndRoles();

			WebElement visibleAddButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='accountuser.php?create_admin=2&accountid=42&mode=add' and contains(@class, 'btn btn-primary')]")));
			
			createUserAndRolesPage.addButton();
			createUserAndRolesPage.newUserName(userName);
			createUserAndRolesPage.userPhone(phone);
			createUserAndRolesPage.userEmail();
			createUserAndRolesPage.userRole();
			createUserAndRolesPage.userType();
		
		}
		@Then("user and roles is created successfully")
		public void user_and_roles_is_created_successfully() throws InterruptedException {
			createUserAndRolesPage.saveButton();

		    WebElement validationMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='swal2-title']")));
			
			Assert.assertEquals(validationMsg.getText(), "New User Added");
			
			
		}
}
