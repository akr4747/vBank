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
import pageObjects.VHubAssetDetailPage;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;

public class VHubLandingPageSD {

	TestContextSetup testContextSetup;
	VHubLandingPage vHubLandingPage;
	VHubAssetDetailPage vHubAssetDetailPage;
	WebDriverWait wait;

	public VHubLandingPageSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
		this.vHubAssetDetailPage = testContextSetup.pageObjectManager.getVHubAssetDetailPage();
		this.wait = new WebDriverWait(vHubLandingPage.driver, Duration.ofSeconds(5));
	}

	@Given("User is on vHub Landing Page")
	public void user_is_on_v_hub_landing_page() throws InterruptedException {

		
		Assert.assertTrue(vHubLandingPage.isSearchBoxVisible(), "Search box is not visible on the vHub Landing Page.");
		vHubLandingPage.searchTextBox();
	}

	@When("user searched Asset Type App {string} from home page")
	public void user_searched_asset_type_app_from_home_page(String assetTypeApp) {

		vHubLandingPage.enterAssetNameOnSearchBox(assetTypeApp);
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
		vHubLandingPage.click_On_vConsent_Card();
		
	}

	@Then("Asset Type search successfully")
	public void asset_type_search_successfully() {

		Assert.assertTrue(
				vHubAssetDetailPage.isSearchResultDisplayed(),
				"The Asset Type 'vConsent' was not found.");
	}

}
