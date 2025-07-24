package stepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.APIAssetDetailPage;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;
import utils.TestData;

public class PostmanJsonSD {
	
	
	TestContextSetup testContextSetup;
	VHubLandingPage vHubLandingPage;
	APIAssetDetailPage apiAssetDetailPage;
	WebDriverWait wait;

	public PostmanJsonSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
		this.apiAssetDetailPage = testContextSetup.pageObjectManager.getapiAssetDetailPage();

	}
	@Given("the user has successfully logged into the application")
	public void the_user_has_successfully_logged_into_the_application() {
	   
		vHubLandingPage.searchTextBox();
		vHubLandingPage.enterAssetNameOnSearchBox(TestData.ASSET_NAME_API);
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
	}
	
	@When("the user searches for a specific API and navigates to its Asset Detail page")
	public void the_user_searches_for_a_specific_api_and_navigates_to_its_asset_detail_page() {
	    
		vHubLandingPage.click_On_API_Card(TestData.ASSET_NAME_API); 
	}
	
	@Then("the user should be able to download the Postman collection in JSON format")
	public void the_user_should_be_able_to_download_the_postman_collection_in_json_format() throws AWTException {

		apiAssetDetailPage.apiPostmanJSONDownload();
		
	}

}
