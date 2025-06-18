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
VHubLandingPage vHublandingPage;

public VHubLandingPageSD(TestContextSetup testContextSetup)
{
	this.testContextSetup=testContextSetup;
	this.vHublandingPage =testContextSetup.pageObjectManager.getVHubLandingPage();
}

@Given("User is on vHub Landing Page")
public void user_is_on_v_hub_landing_page() throws InterruptedException {
    
	Thread.sleep(3000);
	vHublandingPage.searchTextBox();
}
@When("user searched Asset Type App {string} from home page")
public void user_searched_asset_type_app_from_home_page(String assetTypeApp) {
  
		
	vHublandingPage.enterAssetNameOnSearchBox(assetTypeApp);
	
}
@Then("Asset Type search successfully")
public void asset_type_search_successfully() {
  
	vHublandingPage.hitEnter();
	  
    WebDriverWait wait = new WebDriverWait(vHublandingPage.driver, Duration.ofSeconds(5));
    WebElement searchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='vConsent']")));
    
    Assert.assertTrue(searchResult.isDisplayed(), "The Asset Type 'vConsent' was not found in the search results.");
}

}
