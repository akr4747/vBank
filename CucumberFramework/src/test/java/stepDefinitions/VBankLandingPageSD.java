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

public class VBankLandingPageSD {

	TestContextSetup testContextSetup;
	VHubAssetDetailPage vHubAssetDetailPage;
	VHubLandingPage vHubLandingPage;
	WebDriverWait wait;

	public VBankLandingPageSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.vHubAssetDetailPage = testContextSetup.pageObjectManager.getVHubAssetDetailPage();
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();


		this.wait = new WebDriverWait(testContextSetup.driver, Duration.ofSeconds(5));

	}

	@Given("the user has successfully logged in and is on the vHub home page")
	public void the_user_has_successfully_logged_in_and_is_on_the_v_hub_home_page() throws InterruptedException {

		vHubLandingPage.searchTextBox();
		vHubLandingPage.enterAssetNameOnSearchBox("vConsent");
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
		vHubLandingPage.click_On_vConsent_Card();

	}

	@When("the user navigates to the Asset Details page")
	public void the_user_navigates_to_the_asset_details_page() throws InterruptedException {

		vHubAssetDetailPage.clickExperienceOrConfigureApp();

	}

	@Then("the user should be redirected to the vBank Landing Page")
	public void the_user_should_be_redirected_to_the_v_bank_landing_page() {

		testContextSetup.genericUtils.SwitchWindowToChild();

		WebElement searchResult = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nav-title']")));
		Assert.assertTrue(searchResult.isDisplayed(), "User not land on vBank Landing page");
	}

}
