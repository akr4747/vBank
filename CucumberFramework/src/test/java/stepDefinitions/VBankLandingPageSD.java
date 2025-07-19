package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class VBankLandingPageSD {

	TestContextSetup testContextSetup;
	VHubAssetDetailPage vHubAssetDetailPage;
	VHubLandingPage vHubLandingPage;
	VBankLandingPage vBankLandingPage;
	WebDriverWait wait;

	public VBankLandingPageSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.vHubAssetDetailPage = testContextSetup.pageObjectManager.getVHubAssetDetailPage();
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
		this.vBankLandingPage = testContextSetup.pageObjectManager.getVBankLandingPage();

	}

	@Given("the user has successfully logged in and is on the vHub home page")
	public void the_user_has_successfully_logged_in_and_is_on_the_v_hub_home_page() throws InterruptedException {

		vHubLandingPage.searchTextBox();
		vHubLandingPage.enterAssetNameOnSearchBox(TestData.ASSET_NAME_CONSENT);
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
		vHubLandingPage.click_On_vConsent_Card(TestData.ASSET_NAME_CONSENT); 
		
	}

	@When("the user navigates to the Asset Details page")
	public void the_user_navigates_to_the_asset_details_page() throws InterruptedException {

		 boolean shouldSwitchWindow = vHubAssetDetailPage.clickExperienceOrConfigureApp();

		    if (shouldSwitchWindow) {
		        testContextSetup.genericUtils.SwitchWindowToChild(); // only when "Configure App"
		    } else {
		        // When "Experience for Free" is clicked, we wait in that method itself for redirection
		        // But we should still make sure we're on the child window
		        testContextSetup.genericUtils.SwitchWindowToLastOpened();
		    }
	}
	
	@Then("the user should be redirected to the vBank Landing Page")
	public void the_user_should_be_redirected_to_the_v_bank_landing_page() {


		vBankLandingPage.verifyUserIsOnVBankLandingPage();
	}

}
