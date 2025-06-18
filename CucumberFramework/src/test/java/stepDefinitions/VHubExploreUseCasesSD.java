package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssetDetailPage;
import pageObjects.VBankLandingPage;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;

public class VHubExploreUseCasesSD {
	
	  TestContextSetup testContextSetup;
	  VHubLandingPage vHubLandingPage;

	    public VHubExploreUseCasesSD(TestContextSetup testContextSetup) {
	    	
	        this.testContextSetup = testContextSetup;
	        this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();    
	    }

	@Given("the user has logged in successfully and landed on the vHub Home page")
	public void the_user_has_logged_in_successfully_and_landed_on_the_v_hub_home_page() {
	    
		String actualMessage = vHubLandingPage.userName();
        String expectedMessage = "admin";
        org.testng.Assert.assertEquals(actualMessage, expectedMessage, "User is not on the vHub Home page");
	}
	@When("the user clicks on the {string} button displayed on the banner image")
	public void the_user_clicks_on_the_button_displayed_on_the_banner_image(String string) {
		vHubLandingPage.exploreUseCases();
		
	}
	@Then("the system should display all the Top Use Cases")
	public void the_system_should_display_all_the_top_use_cases() throws InterruptedException {
	  Thread.sleep(2000);
	  String actualMessage = vHubLandingPage.titleTopUseCases();
	  String expectedMessage = "Top Use Cases";
	  org.testng.Assert.assertEquals(actualMessage, expectedMessage, "Unable to explore Top Use Cases");
		
	}


}
