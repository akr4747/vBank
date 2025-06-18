package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;

public class VHubHeaderLinkSD {
	

	  TestContextSetup testContextSetup;
	  VHubLandingPage vHubLandingPage;

	    public VHubHeaderLinkSD(TestContextSetup testContextSetup) {
	    	
	        this.testContextSetup = testContextSetup;
	        this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();    
	    }
	    
	    @Given("the user is on the vHub Home page")
	    public void the_user_is_on_the_vhub_home_page() throws InterruptedException {
	    	Thread.sleep(2000);
	        String actualMessage = vHubLandingPage.userName();
	        String expectedMessage = "admin";
	        org.testng.Assert.assertEquals(actualMessage, expectedMessage, "User is not on the vHub Home page");
	    }

	    @When("the user clicks on the Developer Console link")
	    public void the_user_clicks_on_the_developer_console_link() throws InterruptedException {
	    	Thread.sleep(2000);
	        vHubLandingPage.hambergenIcon();
	        Thread.sleep(2000);
	        vHubLandingPage.developerConsole();
	        Thread.sleep(2000);
	        testContextSetup.genericUtils.SwitchWindowToChild();
	        Thread.sleep(2000);
	    }

	    @Then("the user should be redirected to the Vahana Account page")
	    public void the_user_should_be_redirected_to_the_vahana_account_page() {
	        String actualTitle = testContextSetup.driver.getTitle();
	        String expectedTitle = "Vahana Accounts";
	        org.testng.Assert.assertEquals(actualTitle, expectedTitle, "Incorrect title for Vahana Account page");
	    }

	    @When("the user clicks on the Documentation link")
	    public void the_user_clicks_on_the_documentation_link() throws InterruptedException {
	    	Thread.sleep(2000);
	        vHubLandingPage.questionMark();
	        Thread.sleep(2000);
	        vHubLandingPage.documentationLink();
	        Thread.sleep(2000);
	        testContextSetup.genericUtils.SwitchWindowToChild();
	    }

	    @Then("the user should be redirected to the Vahana Academy page")
	    public void the_user_should_be_redirected_to_the_vahana_academy_page() {
	        String actualTitle = testContextSetup.driver.getTitle();
	        String expectedTitle = "vHub – Vahana Academy";
	        org.testng.Assert.assertEquals(actualTitle, expectedTitle, "Incorrect title for Vahana Academy page");
	    }

	    @When("the user clicks on the Vahana Community link")
	    public void the_user_clicks_on_the_vahana_community_link() throws InterruptedException {
	    	Thread.sleep(2000);
	        vHubLandingPage.questionMark();
	        Thread.sleep(2000);
	        vHubLandingPage.vahanaCommunity();
	        Thread.sleep(2000);
	        testContextSetup.genericUtils.SwitchWindowToChild();
	    }

	    @Then("the user should be redirected to the Vahana Community page")
	    public void the_user_should_be_redirected_to_the_vahana_community_page() {
	        String actualTitle = testContextSetup.driver.getTitle();
	        String expectedTitle = "Vahana Community - Developer community for Vahana Platform. Get active support, updates, and answers for Vahana cloud products including vFlow, vDesigner, vConnect, and more on the official Vahana Community forum. Join now for expert help and product announcements.";
	        org.testng.Assert.assertEquals(actualTitle, expectedTitle, "Incorrect title for Vahana Community page");
	    }
	}