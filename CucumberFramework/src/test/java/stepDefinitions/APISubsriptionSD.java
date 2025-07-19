package stepDefinitions;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.APIAssetDetailPage;
import pageObjects.VHubAssetDetailPage;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;
import utils.TestData;

public class APISubsriptionSD {
	
	TestContextSetup testContextSetup;
	VHubAssetDetailPage vHubAssetDetailPage;
	VHubLandingPage vHubLandingPage;
	APIAssetDetailPage apiAssetDetailPage;
	WebDriverWait wait;

	public APISubsriptionSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.apiAssetDetailPage = testContextSetup.pageObjectManager.getapiAssetDetailPage();
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();

	}
	
	@Given("the user has logged in successfully and searched for the API")
	public void the_user_has_logged_in_successfully_and_searched_for_the_api() {
		
		vHubLandingPage.searchTextBox();
		vHubLandingPage.enterAssetNameOnSearchBox(TestData.ASSET_NAME_API);
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
		
	  
	}
	@When("the user click on api card it navigate to the API asset detail page")
	public void the_user_click_on_api_card_it_navigate_to_the_api_asset_detail_page() {
		vHubLandingPage.click_On_API_Card(TestData.ASSET_NAME_API); 
	}
	// Subscription by Swagger
	
	@Then("the user should be able to subscribe to the API successfully by swagger")
	public void the_user_should_be_able_to_subscribe_to_the_api_successfully_by_swagger() {
		apiAssetDetailPage.apiSubscriptionBySwagger();
	}

	// Subscription by Postman
	@Then("the user should be able to subscribe to the API successfully by postman")
	public void the_user_should_be_able_to_subscribe_to_the_api_successfully_by_postman() {
		apiAssetDetailPage.apiSubscriptionByPostman();
	}
}
