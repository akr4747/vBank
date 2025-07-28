package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VHubFooter;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;

public class VHubFooterSD {
	
	TestContextSetup testContextSetup;
	VHubFooter vHubFooter;
	VHubLandingPage vHubLandingPage;

	public VHubFooterSD(TestContextSetup testContextSetup){
		this.testContextSetup = testContextSetup;
		this.vHubFooter = testContextSetup.pageObjectManager.getVHubFooter();
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
	}
	
	@Given("the user logged in successfully and landed on the vHub Home page")
    public void the_user_logged_in_successfully_and_landed_on_the_vHub_Home_page(){
		 vHubLandingPage.exploreUseCasesText();
	}
	
	// first Test Case
	@When("the user navigates to the footer and clicks on the Become a Partner link")
	public void the_user_navigates_to_the_footer_and_clicks_on_the_become_a_partner_link() {
	     vHubFooter.clickOnBecomeAPartner();
		
	}
	@Then("the system should navigate to the Partner Onboarding page")
	public void the_system_should_navigate_to_the_partner_onboarding_page() {
		 vHubFooter.verifyOnBoardingPage();
	}
	
	// second test case
	@When("the user navigates to the footer and clicks on the Decimal Technologies link")
	public void the_user_navigates_to_the_footer_and_clicks_on_the_decimal_technologies_link() {
         vHubFooter.clickOnDecimalTechnology();
         testContextSetup.genericUtils.SwitchWindowToChild();
	}
	
	@Then("the system should navigate to the Decimal Technologies website")
	public void the_system_should_navigate_to_the_decimal_technologies_website() {
	     vHubFooter.verifyDecimalTechnologyLink();
	}
	
	// third Test case
	@When("the user navigates to the footer and clicks on the Vahana Cloud link")
	public void the_user_navigates_to_the_footer_and_clicks_on_the_vahana_cloud_link() {
	    vHubFooter.clickVahanaCloud();
	    testContextSetup.genericUtils.SwitchWindowToChild();
		
	}
	@Then("the system should navigate to the Vahana Cloud platform")
	public void the_system_should_navigate_to_the_vahana_cloud_platform() {
        	vHubFooter.verifyVahanaCloudLink();
	}
	
	// forth test case
	@When("the user navigates to the footer and clicks on the Contact Us link")
	public void the_user_navigates_to_the_footer_and_clicks_on_the_contact_us_link() {
		 vHubFooter.clickContactUs();
		 testContextSetup.genericUtils.SwitchWindowToChild();
	}
	
	@Then("the system should navigate to the contact us page")
	public void the_system_should_navigate_to_the_contact_us_page() {
         vHubFooter.verifyContactUsLink();
	}
	
	// fifth test case
	@When("the user navigates to the footer and clicks on the Documentation link")
	public void the_user_navigates_to_the_footer_and_clicks_on_the_documentation_link() {
		 vHubFooter.clickDocumentation();
		 testContextSetup.genericUtils.SwitchWindowToChild();

	}
	@Then("the system should navigate to the Vahana Academy page")
	public void the_system_should_navigate_to_the_vahana_academy_page() {
		 vHubFooter.verifyDocumentationLink();

	}
	
	// sixth test case
	@When("the user navigates to the footer and clicks on the Vahana Community link")
	public void the_user_navigates_to_the_footer_and_clicks_on_the_vahana_community_link() {
		vHubFooter.clickVahanaCommunity();
		 testContextSetup.genericUtils.SwitchWindowToChild();
	}
	@Then("the system should navigate to the Vahana community page")
	public void the_system_should_navigate_to_the_vahana_community_page() {
		vHubFooter.verifyVahanCommunityLink();

	}
	
	// seventh test case
	@When("the user navigates to the footer and clicks on the Vahana Hub Support link")
	public void the_user_navigates_to_the_footer_and_clicks_on_the_vahana_hub_support_link() {
	   vHubFooter.clickHubSupport();
	}
	@Then("the system should navigate to the Email page")
	public void the_system_should_navigate_to_the_email_page() {
		vHubFooter.verifyHubSupportText();
	}
	
	// eight test case
	@When("the user navigates to the footer and clicks on the LinkedIn link")
	public void the_user_navigates_to_the_footer_and_clicks_on_the_linked_in_link() {
		 vHubFooter.clickLinkeIn();
		 testContextSetup.genericUtils.SwitchWindowToChild();
	}
	@Then("the system should navigate to the LinkedIn page")
	public void the_system_should_navigate_to_the_linked_in_page() {
		 vHubFooter.verifyLinkInLink();
		
	}
	
	// ninth test case
	@When("the user navigates to the footer and clicks on the YouTube link")
	public void the_user_navigates_to_the_footer_and_clicks_on_the_you_tube_link() {
		 vHubFooter.clickYoutube();;
		 testContextSetup.genericUtils.SwitchWindowToChild();
		
	}
	@Then("the system should navigate to the YouTube page")
	public void the_system_should_navigate_to_the_you_tube_page() {
	    vHubFooter.verifyYouTubeLink();
		
	}

}
