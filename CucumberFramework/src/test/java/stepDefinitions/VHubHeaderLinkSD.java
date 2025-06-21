package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;

public class VHubHeaderLinkSD {

	TestContextSetup testContextSetup;
	VHubLandingPage vHubLandingPage;
	WebDriverWait wait;

	public VHubHeaderLinkSD(TestContextSetup testContextSetup) {

		this.testContextSetup = testContextSetup;
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
		this.wait = new WebDriverWait(vHubLandingPage.driver, Duration.ofSeconds(3));
	}

	@Given("the user is on the vHub Home page")
	public void the_user_is_on_the_vhub_home_page() throws InterruptedException {

		vHubLandingPage.waitForExploreUseCasesVisible();
		String expectedMessage = "Explore Use Cases";
		String actualMessage = vHubLandingPage.exploreUseCasesText();
		org.testng.Assert.assertEquals(actualMessage, expectedMessage, "User is not on the vHub Home page");
	}

	@When("the user clicks on the Developer Console link")
	public void the_user_clicks_on_the_developer_console_link() throws InterruptedException {

		vHubLandingPage.hambergenIcon();

		vHubLandingPage.developerConsole();

		testContextSetup.genericUtils.SwitchWindowToChild();
	}

	@Then("the user should be redirected to the Vahana Account page")
	public void the_user_should_be_redirected_to_the_vahana_account_page() {


		vHubLandingPage.waitForVahanaAccountPageHeader();
		String expectedTitle = "Vahana Accounts";
		String actualTitle = testContextSetup.driver.getTitle();
		org.testng.Assert.assertEquals(actualTitle, expectedTitle, "Incorrect title for Vahana Account page");
	}

	@When("the user clicks on the Documentation link")
	public void the_user_clicks_on_the_documentation_link() throws InterruptedException {


		vHubLandingPage.waitForQuestionMark();
		vHubLandingPage.documentationLink();

		testContextSetup.genericUtils.SwitchWindowToChild();
	}

	@Then("the user should be redirected to the Vahana Academy page")
	public void the_user_should_be_redirected_to_the_vahana_academy_page() {

		String expectedTitle = "vHub – Vahana Academy";
		String actualTitle = testContextSetup.driver.getTitle();
		org.testng.Assert.assertEquals(actualTitle, expectedTitle, "Incorrect title for Vahana Academy page");
	}

	@When("the user clicks on the Vahana Community link")
	public void the_user_clicks_on_the_vahana_community_link() throws InterruptedException {


		vHubLandingPage.waitForQuestionMark();
		vHubLandingPage.vahanaCommunity();

		testContextSetup.genericUtils.SwitchWindowToChild();
	}

	@Then("the user should be redirected to the Vahana Community page")
	public void the_user_should_be_redirected_to_the_vahana_community_page() {

		String expectedTitle = "Vahana Community - Developer community for Vahana Platform. Get active support, updates, and answers for Vahana cloud products including vFlow, vDesigner, vConnect, and more on the official Vahana Community forum. Join now for expert help and product announcements.";
		String actualTitle = testContextSetup.driver.getTitle();
		org.testng.Assert.assertEquals(actualTitle, expectedTitle, "Incorrect title for Vahana Community page");
	}
}