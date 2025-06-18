package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CreateAccountPage;
import utils.TestContextSetup;

public class CreateAccountStepDefinition {

	TestContextSetup testContextSetup;
	CreateAccountPage createAccountPage;
	
	public CreateAccountStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.createAccountPage =testContextSetup.pageObjectManager.getCreateAccountPage();
	}
	
	@Given("user navigates to the Dashboard to create a new account")
	public void user_navigates_to_the_dashboard_to_create_a_new_account() throws InterruptedException {

		createAccountPage.clickCreateAccountButton();
		
	}
	@When("user fills all the mandatory fields with correct values")
//	public void user_fills_all_the_mandatory_fields_with_correct_values(String accountName, String primaryContactName, String email, String phone, String billingAddress1, String billingAddress2,
//	String billingCity,	String billingState, String billingCode	) {
	public void user_fills_all_the_mandatory_fields_with_correct_values(io.cucumber.datatable.DataTable dataTable) {
		
		WebDriverWait wait=new WebDriverWait(createAccountPage.driver, Duration.ofSeconds(2));
        WebElement visibleElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='acc_name']")));
		
		java.util.List<java.util.Map<String, String>> accountDetails = dataTable.asMaps(String.class, String.class);

	        // Retrieve first row of data from the table
	        java.util.Map<String, String> accountData = accountDetails.get(0);
	        
	        createAccountPage.enterAccountName();
	        createAccountPage.enterPrimaryContactName(accountData.get("primaryContactName"));
	        createAccountPage.enterEmail();
	        createAccountPage.enterPhone(accountData.get("phone"));
	        createAccountPage.selectAccountType(); // Adjust this if type selection needs data
	        createAccountPage.selectBillingCountry(); // Adjust this if country selection needs data
	        createAccountPage.enterBillingAddress1(accountData.get("billingAddress1"));
	        createAccountPage.enterBillingAddress2(accountData.get("billingAddress2"));
	        createAccountPage.enterBillingCity(accountData.get("billingCity"));
	        createAccountPage.enterBillingState(accountData.get("billingState"));
	        createAccountPage.enterBillingPostalCode(accountData.get("billingPostalCode"));
	        
	}
	@Then("account is created successfully")
	public void account_is_created_successfully() throws InterruptedException {
	
		createAccountPage.clickSaveNewAccount();
		Thread.sleep(5000);
		
	}
	
}
