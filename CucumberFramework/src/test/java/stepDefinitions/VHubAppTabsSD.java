package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VHubAssetDetailPage;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;
import utils.TestData;

public class VHubAppTabsSD {
	
	
	TestContextSetup testContextSetup;
	VHubLandingPage vHubLandingPage;
	VHubAssetDetailPage vHubAssetDetailPage;

	
	public VHubAppTabsSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.vHubAssetDetailPage = testContextSetup.pageObjectManager.getVHubAssetDetailPage();
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
		
	}
	
	@Given("the user is logged in and on the vHub page")
	public void the_user_is_logged_in_and_on_the_v_hub_page() {
		
		vHubLandingPage.searchTextBox();
		vHubLandingPage.enterAssetNameOnSearchBox(TestData.ASSET_NAME_CONSENT);
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
		vHubLandingPage.click_On_vConsent_Card(TestData.ASSET_NAME_CONSENT);
	    
	}
	@When("the user navigates to the App Asset Detail page")
	public void the_user_navigates_to_the_app_asset_detail_page() {
	    
		vHubAssetDetailPage.userInOnAssetDetailPage(TestData.ASSET_NAME_CONSENT);
		
	}
	@Then("the user should be able to successfully navigate through all available tabs")
	public void the_user_should_be_able_to_successfully_navigate_through_all_available_tabs() {
		
		vHubAssetDetailPage.clickAboutTab();
		vHubAssetDetailPage.ClickWhatsIncludedTab();
		vHubAssetDetailPage.clicklinkedUseCasesTab();
		vHubAssetDetailPage.clickTermsConditionsTab();
		vHubAssetDetailPage.clickSupportTab();
		
	}

}
