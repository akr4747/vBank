package stepDefinitions;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VBankLandingPage;
import pageObjects.VHubAssetDetailPage;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;
import utils.TestData;

public class LogoutSD {
	
	TestContextSetup testContextSetup;
	VHubAssetDetailPage vHubAssetDetailPage;
	VHubLandingPage vHubLandingPage;
	VBankLandingPage vBankLandingPage;
	WebDriverWait wait;

	public LogoutSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.vHubAssetDetailPage = testContextSetup.pageObjectManager.getVHubAssetDetailPage();
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
		this.vBankLandingPage = testContextSetup.pageObjectManager.getVBankLandingPage();

	}
	// First Test Case
	
	@Given("the user is logged in and on the vHub Home page")
	public void the_user_is_logged_in_and_on_the_v_hub_home_page() {

		vHubLandingPage.clickProfileDetails();
		
	}

	@When("the user logs out from vHub using the header menu")
	public void the_user_logs_out_from_v_hub_using_the_header_menu() {
		
		vHubLandingPage.clickVHubLogout();
		
	}
	
	@Then("the user should be redirected to the vHub login page")
	public void the_user_should_be_redirected_to_the_v_hub_login_page() {
	   
		vHubLandingPage.vHubloginButton();
	}
	
	// Second Test Case
	
	@Given("the user is logged in and search vConsent")
	public void the_user_is_logged_in_and_search_v_consent() {
	   
		vHubLandingPage.searchTextBox();
		vHubLandingPage.enterAssetNameOnSearchBox(TestData.ASSET_NAME_CONSENT);
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
		vHubLandingPage.click_On_vConsent_Card(TestData.ASSET_NAME_CONSENT); 
	}
	
	@When("the user navigates to the Asset Details page and accesses the vBank Landing Page")
		public void the_user_navigates_to_the_asset_details_page_and_accesses_the_v_bank_landing_page() {
		 
			 boolean shouldSwitchWindow = vHubAssetDetailPage.clickExperienceOrConfigureApp();

			    if (shouldSwitchWindow) {
			        testContextSetup.genericUtils.SwitchWindowToChild(); // only when "Configure App"
			    } else {
			        testContextSetup.genericUtils.SwitchWindowToLastOpened();
			    }
			    
			    vBankLandingPage.verifyUserIsOnVBankLandingPage();
			
		}
		@When("the user logs out from vBank using the header menu")
		public void the_user_logs_out_from_v_bank_using_the_header_menu() {
		   
			vBankLandingPage.clickUserName();
			vBankLandingPage.clickVBankLogout();
			
		}
		@Then("the user should be redirected back to the Asset Details page")
		public void the_user_should_be_redirected_back_to_the_asset_details_page() {
			vHubAssetDetailPage.assetDetailsText();
			
		}
}
