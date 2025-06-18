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
import pageObjects.LoginPage;

import utils.TestContextSetup;

public class GDTLandingPageStepDefinition {
	
	TestContextSetup testContextSetup;
	LoginPage loginPage;
	
	
	public GDTLandingPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.loginPage =testContextSetup.pageObjectManager.getLoginPage();
		
	}
	
	@Given("^the user successfully enters email (.+) and password (.+) on the landing page$")
    public void the_user_successfully_enters_email_and_password_on_the_landing_page(String email, String password) throws InterruptedException {

		loginPage.clickOnSearchButton();
    }

    @When("^search account name (.+) from the dashboard$")
    public void search_account_name_from_the_dashboard(String accountName) throws InterruptedException {
       
    
        loginPage.enterAccountNameOnSearchBox(accountName);
       
    }

    @Then("account name search successfully")
    public void account_name_search_successfully() throws InterruptedException {
    	
       loginPage.selectSearchButton();
        
       WebDriverWait wait = new WebDriverWait(loginPage.driver, Duration.ofSeconds(5));
       WebElement searchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table//td[contains(text(),'Moin')]")));
       
       Assert.assertTrue(searchResult.isDisplayed(), "The account name 'Moin' was not found in the search results.");
        
    }
}