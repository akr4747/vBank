package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VBankLandingPage;
import pageObjects.VHubMySubscriptions;
import pageObjects.VHubAccountDetails;
import pageObjects.VHubAssetDetailPage;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;

public class VHubSubscriptionsSD {

	TestContextSetup testContextSetup;
	VHubLandingPage vHubLandingPage;
	VHubAccountDetails vHubAccountDetails;
	VHubMySubscriptions vHubMySubscriptions;
	
	public VHubSubscriptionsSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
		this.vHubAccountDetails = testContextSetup.pageObjectManager.getVHubAccountDetails();
		this.vHubMySubscriptions = testContextSetup.pageObjectManager.getVhubMySubscriptions();
	}
	
	@Given("the user is logged in and lands on the vHub page")
	public void the_user_is_logged_in_and_on_the_vHub_page() {
		
		vHubLandingPage.clickProfileDetails();
		
	}
	
	@When("the user navigates to the Account Details page")
	public void the_user_navigates_to_the_account_details_page() {
	    
		vHubLandingPage.clickAccountSettings();
		vHubAccountDetails.clickSubscriptions();
		
	}
	@Then("the user should be on the Subscriptions page")
	public void the_user_should_be_on_the_subscriptions_page() {
	  
		vHubMySubscriptions.clickOnExploreAssetsOrUserOnMySubscriptionsPage("Workspace Name");
	}
}
