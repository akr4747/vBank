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

public class APIAssetDetailPageTabsSD {
	
	TestContextSetup testContextSetup;
	VHubAssetDetailPage vHubAssetDetailPage;
	VHubLandingPage vHubLandingPage;
	APIAssetDetailPage apiAssetDetailPage;
	WebDriverWait wait;

	public APIAssetDetailPageTabsSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.apiAssetDetailPage = testContextSetup.pageObjectManager.getapiAssetDetailPage();
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
	}
	
	@Given("the user is logged in and search the API")
	public void the_user_is_logged_in_and_search_the_API(){
		vHubLandingPage.searchTextBox();
		vHubLandingPage.enterAssetNameOnSearchBox(TestData.ASSET_NAME_API);
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
		vHubLandingPage.click_On_API_Card(TestData.ASSET_NAME_API); 
		
	}
	
	@When("the user navigates to the API Asset Detail page")
	public void the_user_navigates_to_the_api_asset_detail_page() {
		apiAssetDetailPage.apiAssetNameOnDetailPage(TestData.ASSET_NAME_API);
	    
	}
	@Then("the user should be able to successfully navigate through all the available tabs")
	public void the_user_should_be_able_to_successfully_navigate_through_all_the_available_tabs() {
	   
		apiAssetDetailPage.clickapiAboutTab();
		apiAssetDetailPage.clickapiDocumentationTab();
		apiAssetDetailPage.clickapiFeaturesTab();
		apiAssetDetailPage.clickapiLinkedUseCasesTab();
		apiAssetDetailPage.clickapiTermsAndConditionsTab();
		apiAssetDetailPage.clickapiSupportTab();
	}

}
