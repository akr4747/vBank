package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VHubAssetDetailPage;
import pageObjects.VBankAppSettings;
import pageObjects.VBankConsentConfiguration;
import pageObjects.VBankLandingPage;
import pageObjects.VBankPublishApp;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;

public class VBankPublishAppSD {

	TestContextSetup testContextSetup;
	VHubLandingPage vHubLandingPage;
	VHubAssetDetailPage vHubAssetDetailPage;
	VBankLandingPage vBankLandingPage;
	VBankAppSettings vBankAppSettings;
	VBankConsentConfiguration vBankConsentConfiguration;
	VBankPublishApp vBankPublishApp;
	WebDriverWait wait;

	public VBankPublishAppSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
		this.vHubAssetDetailPage = testContextSetup.pageObjectManager.getVHubAssetDetailPage();
		this.vBankLandingPage = testContextSetup.pageObjectManager.getVBankLandingPage();
		this.vBankAppSettings = testContextSetup.pageObjectManager.getVBankAppSettings();
		this.vBankConsentConfiguration = testContextSetup.pageObjectManager.getVBankConsentConfiguration();
		this.vBankPublishApp = testContextSetup.pageObjectManager.getVBankPublishApp();

	}

	@Given("User Land on vbank Landing page")
	public void user_land_on_vbank_landing_page() throws InterruptedException {

		vHubLandingPage.searchTextBox();
		vHubLandingPage.enterAssetNameOnSearchBox("vConsent");
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
		vHubLandingPage.click_On_vConsent_Card();
		vHubAssetDetailPage.clickExperienceOrConfigureApp();
		testContextSetup.genericUtils.SwitchWindowToChild();
		

	}

	@Given("Fill all the required field of App setting page")
	public void fill_all_the_required_field_of_app_setting_page() throws InterruptedException {

		vBankLandingPage.create_New_App();

		vBankAppSettings.waitForAppSettingsPageToLoad();
		vBankAppSettings.enter_App_Name();
		vBankAppSettings.effective_Date();

		vBankAppSettings.waitForCalendarToAppear();
		vBankAppSettings.current_Effective_Date();

		vBankAppSettings.driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);

		vBankAppSettings.waitForNextButtonToBeClickable();
		vBankAppSettings.next_Button();

	}

	@When("Fill all required  field of Consent configuration page")
	public void fill_all_required_field_of_consent_configuration_page(DataTable dataTable) throws InterruptedException {

		vBankConsentConfiguration.add_New_Consent_Button();
		
		vBankConsentConfiguration.enter_Consent_Name();

		List<String> consentDetails = dataTable.asList();
		String consentNotice = consentDetails.get(0);

		vBankConsentConfiguration.enter_Consent_Notice(consentNotice);

		vBankConsentConfiguration.save_Button();

		vBankConsentConfiguration.next_Button();

	}

	@Then("Fill all the required field on Publish App page.")
	public void fill_all_the_required_field_on_publish_app_page(DataTable dataTable) throws InterruptedException {

		List<List<String>> publishData = dataTable.asLists();
		String releaseName = publishData.get(0).get(0); // "First Release"
		String releasecomment = publishData.get(1).get(0);

		vBankPublishApp.publish_Release_Name(releaseName);
		vBankPublishApp.publish_Comment(releasecomment);
		vBankPublishApp.publish_To_Sandbox();

		vBankPublishApp.yes_Publish();
		
		String actual = vBankPublishApp.success_Msg();

	}

}
