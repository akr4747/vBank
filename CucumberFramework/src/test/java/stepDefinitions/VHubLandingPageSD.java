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
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;

public class VHubLandingPageSD {

	TestContextSetup testContextSetup;
	VHubLandingPage vHubLandingPage;
	WebDriverWait wait;

	public VHubLandingPageSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
		this.wait = new WebDriverWait(vHubLandingPage.driver, Duration.ofSeconds(3));
	}

	@Given("User is on vHub Landing Page")
	public void user_is_on_v_hub_landing_page() throws InterruptedException {

		WebElement searchBox = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='search']")));
		Assert.assertTrue(searchBox.isDisplayed(), "Search box is not visible on the vHub Landing Page.");
		vHubLandingPage.searchTextBox();
	}

	@When("user searched Asset Type App {string} from home page")
	public void user_searched_asset_type_app_from_home_page(String assetTypeApp) {

		vHubLandingPage.enterAssetNameOnSearchBox(assetTypeApp);
		vHubLandingPage.hitEnter();
		vHubLandingPage.driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
	}

	@Then("Asset Type search successfully")
	public void asset_type_search_successfully() {

		WebElement searchResult = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='vConsent']")));
		Assert.assertTrue(searchResult.isDisplayed(), "The Asset Type 'vConsent' was not found in the search results.");
	}

}
