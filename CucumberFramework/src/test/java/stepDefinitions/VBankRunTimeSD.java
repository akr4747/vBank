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
		vHubLandingPage.enterAssetNameOnSearchBox("vConsent");
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
		vHubLandingPage.click_On_vConsent_Card();
		
	}
	@When("the user clicks on the Asset Details page")
	public void the_user_clicks_on_the_asset_details_page() {
	
		vHubAssetDetailPage.clickExperienceOrConfigureApp();	
		testContextSetup.genericUtils.SwitchWindowToChild();

	}
	
	@When("user on vBank Landing Page")
	public void user_on_v_bank_landing_page() {
	   
		vBankLandingPage.verifyUserIsOnVBankLandingPage();
	
	}
	
	@Then("the system should redirect the user to the Runtime environment")
	public void the_system_should_redirect_the_user_to_the_runtime_environment() {
	
		vBankLandingPage.clickViewInsights();
		testContextSetup.genericUtils.SwitchWindowToChild();
		vBankLandingPage.verifyRuntimeUrl("https://decimal-vhub.vahanacloud.com/");
		
	}
}
