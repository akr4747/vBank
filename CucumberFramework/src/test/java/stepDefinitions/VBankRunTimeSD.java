package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VBankLandingPage;
import pageObjects.VHubAssetDetailPage;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;
import utils.TestData;

public class VBankRunTimeSD {

	TestContextSetup testContextSetup;
	VHubLandingPage vHubLandingPage;
	VBankLandingPage vBankLandingPage;
	VHubAssetDetailPage vHubAssetDetailPage;

	
	public VBankRunTimeSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.vHubAssetDetailPage = testContextSetup.pageObjectManager.getVHubAssetDetailPage();
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
		this.vBankLandingPage = testContextSetup.pageObjectManager.getVBankLandingPage();
	}
	
	@Given("the user is logged in and on the vHub home page")
	public void the_user_is_logged_in_and_on_the_v_hub_home_page() {
	
		vHubLandingPage.searchTextBox();
		vHubLandingPage.enterAssetNameOnSearchBox(TestData.ASSET_NAME_CONSENT);
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
		vHubLandingPage.click_On_vConsent_Card(TestData.ASSET_NAME_CONSENT);
		
	}

	@When("the user opens the Asset Details page for the app")
	public void the_user_opens_the_asset_details_page_for_the_app() {
	    
		 boolean shouldSwitchWindow = vHubAssetDetailPage.clickExperienceOrConfigureApp();

		    if (shouldSwitchWindow) {
		        testContextSetup.genericUtils.SwitchWindowToChild(); // only when "Configure App"
		    } else {
		        // When "Experience for Free" is clicked, we wait in that method itself for redirection
		        // But we should still make sure we're on the child window
		        testContextSetup.genericUtils.SwitchWindowToLastOpened();
		    }
		    
	}
	@When("the user is redirected to the vBank landing page")
	public void the_user_is_redirected_to_the_v_bank_landing_page() {
		
		vBankLandingPage.verifyUserIsOnVBankLandingPage();
		
// First Test Case
	}
	@Then("the system should navigate the user to the Sandbox Runtime environment")
	public void the_system_should_navigate_the_user_to_the_production_runtime_environment() {
	    
		vBankLandingPage.clickViewInsights();
		vBankLandingPage.clickAccessOnSandbox();
		testContextSetup.genericUtils.SwitchWindowToChildToChild();
		vBankLandingPage.verifyRuntimeUrl();
	}
	
//	Second Test Case
	
	@Then("the system should navigate the user to the Production Runtime environment")
	public void the_system_should_navigate_the_user_to_the_sandbox_runtime_environment() {
	   
		vBankLandingPage.clickViewInsights();
		vBankLandingPage.clickAccessOnProduction();
		testContextSetup.genericUtils.SwitchWindowToChildToChild();
		vBankLandingPage.verifyRuntimeUrl();
		
	}
	
	
	
}
