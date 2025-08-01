package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VBankLandingPage;
import pageObjects.VHubMySubscriptions;
import pageObjects.VHubDashboard;
import pageObjects.VHubAssetDetailPage;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;

public class VHubMySubscriptionsSD {

	TestContextSetup testContextSetup;
	VHubLandingPage vHubLandingPage;
	VHubDashboard vHubAccountDetails;
	VHubMySubscriptions vHubMySubscriptions;
	
	public VHubMySubscriptionsSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
		this.vHubAccountDetails = testContextSetup.pageObjectManager.getVHubAccountDetails();
		this.vHubMySubscriptions = testContextSetup.pageObjectManager.getVhubMySubscriptions();
	}
	
	@Given("the user is logged in and navigates to the Account Detail Page")
	public void the_user_is_logged_in_and_navigates_to_the_account_detail_page() {
		
		vHubLandingPage.clickProfileDetails();
	}
	
	@When("the user is on the Subscriptions page")
	public void the_user_is_on_the_subscriptions_page() {

		vHubLandingPage.clickAccountSettings();
		vHubAccountDetails.clickSubscriptions();
	}
	
	// Service Up
	@Then("the user applies the Service Up filter and views the details")
	public void the_user_applies_the_service_up_filter_and_views_the_details() {

		vHubMySubscriptions.clickOnServiceUpViewDetails();
	}
	
	@Then("the user applies the Service Up filter and submits a Request Support")
	public void the_user_applies_the_service_up_filter_and_submits_a_request_support(DataTable dataTable) {
		
		vHubMySubscriptions.clickOnseriveUpRequestSupport(dataTable);
		
	}
	
	@Then("the user applies the Service Up filter and submits a Request for Production")
	public void the_user_applies_the_service_up_filter_and_submits_a_request_for_production() {
	   
		vHubMySubscriptions.clickOnseriveUpRequestProduction();
	}
	

	@Then("the user applies the Service Up filter and submits a Request to Unsubscribe")
	public void the_user_applies_the_service_up_filter_and_submits_a_request_to_unsubscribe(DataTable dataTable) {
		vHubMySubscriptions.clickOnseriveUpRequestUnscribe(dataTable);
		
	}
	
	
	// Service Down
	
	@Then("the user applies the Service Down filter and views the details")
	public void the_user_applies_the_service_down_filter_and_views_the_details() {
		vHubMySubscriptions.clickOnServiceDownViewDetails();
		
	}
	
	@Then("the user applies the Service Down filter and submits a Request Support")
	public void the_user_applies_the_service_down_filter_and_submits_a_request_support(DataTable dataTable) {
	  
		vHubMySubscriptions.clickOnseriveDownRequestSupport(dataTable);
	}
	
	@Then("the user applies the Service Down filter and submits a Request for Production")
	public void the_user_applies_the_service_down_filter_and_submits_a_request_for_production() {
		vHubMySubscriptions.clickOnseriveDownRequestProduction();
		
	}
	
	@Then("the user applies the Service Down filter and submits a Request to Unsubscribe")
	public void the_user_applies_the_service_down_filter_and_submits_a_request_to_unsubscribe(DataTable dataTable) {
		vHubMySubscriptions.clickOnseriveDownRequestUnscribe(dataTable);
		
	}
	
	// Credit Expired
	@Then("the user applies the Credit Expired filter and views the details")
	public void the_user_applies_the_credit_expired_filter_and_views_the_details() {
		
		vHubMySubscriptions.clickOnCreditExpiredViewDetails();
		
	}
	
	@Then("the user applies the Credit Expired filter and submits a Request for Credits")
	public void the_user_applies_the_credit_expired_filter_and_submits_a_request_for_credits(DataTable dataTable) {
		vHubMySubscriptions.clickOnCreditExpiredRequestCredit(dataTable);
		
	}
	
	@Then("the user applies the Credit Expired filter and submits a Request Support")
	public void the_user_applies_the_credit_expired_filter_and_submits_a_request_support(DataTable dataTable) {

		vHubMySubscriptions.clickOnCreditExpiredRequestSupport(dataTable);
		
	}
	
	@Then("the user applies the Credit Expired filter and submits a Request for Production")
	public void the_user_applies_the_credit_expired_filter_and_submits_a_request_for_production() {
		vHubMySubscriptions.clickOnCreditExpiredRequestProduction();
		
	}
	
	@Then("the user applies the Credit Expired filter and submits a Request to Unsubscribe")
	public void the_user_applies_the_credit_expired_filter_and_submits_a_request_to_unsubscribe(DataTable dataTable) {
		vHubMySubscriptions.clickOnCreditExpiredRequestUnscribe(dataTable);
		
	}
	
	// Depricate
	@Then("the user applies the Deprecated filter and views the details")
	public void the_user_applies_the_deprecated_filter_and_views_the_details() {
		vHubMySubscriptions.clickOnDepricateViewDetails();
		
	}
	
	@Then("the user applies the Deprecated filter and submits a Request Support")
	public void the_user_applies_the_deprecated_filter_and_submits_a_request_support(DataTable dataTable) {
		vHubMySubscriptions.clickOnDepricateRequestSupport(dataTable);
		
	}
	
	@Then("the user applies the Deprecated filter and submits a Request to Unsubscribe")
	public void the_user_applies_the_deprecated_filter_and_submits_a_request_to_unsubscribe(DataTable dataTable) {
	  
		vHubMySubscriptions.clickOnDepricateRequestUnscribe(dataTable);
	}

}
