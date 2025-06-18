package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssetDetailPage;
import pageObjects.VBankAppSettings;
import pageObjects.VBankConsentConfiguration;
import pageObjects.VBankLandingPage;
import pageObjects.VBankPublishApp;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;

public class VBankPublishAppSD {
	
	TestContextSetup testContextSetup;
	VHubLandingPage vHubLandingPage;
	AssetDetailPage assetDetailPage;
	VBankLandingPage vBankLandingPage;
	VBankAppSettings vBankAppSettings;
	VBankConsentConfiguration vBankConsentConfiguration;
	VBankPublishApp vBankPublishApp;

	public VBankPublishAppSD(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.vHubLandingPage =testContextSetup.pageObjectManager.getVHubLandingPage();
		this.assetDetailPage =testContextSetup.pageObjectManager.getAssetDetailPage();
		this.vBankLandingPage =testContextSetup.pageObjectManager.getVBankLandingPage();
		this.vBankAppSettings =testContextSetup.pageObjectManager.getVBankAppSettings();
		this.vBankConsentConfiguration=testContextSetup.pageObjectManager.getVBankConsentConfiguration();
		this.vBankPublishApp=testContextSetup.pageObjectManager.getVBankPublishApp();
	}
	
	@Given("User Land on vbank Landing page")
	public void user_land_on_vbank_landing_page() throws InterruptedException {
	  
		vHubLandingPage.searchTextBox();
		vHubLandingPage.enterAssetNameOnSearchBox("vConsent");
        vHubLandingPage.hitEnter();
        WebDriverWait wait = new WebDriverWait(vHubLandingPage.driver, Duration.ofSeconds(5));
        WebElement searchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='vConsent']")));
        Thread.sleep(2000);
        vHubLandingPage.click_On_vConsent_Card();
        
        assetDetailPage.clickExperienceOrConfigureApp();
        testContextSetup.genericUtils.SwitchWindowToChild();
        
        
	}
	@Given("Fill all the required field of App setting page")
	public void fill_all_the_required_field_of_app_setting_page() throws InterruptedException {
		
		vBankLandingPage.create_New_App();
		Thread.sleep(3000);
		vBankAppSettings.enter_App_Name();
		vBankAppSettings.effective_Date();
		Thread.sleep(1000);
		vBankAppSettings.current_Effective_Date();
		Thread.sleep(2000);
		vBankAppSettings.next_Button();
		Thread.sleep(2000);
		
	  
	}
	@When("Fill all required  field of Consent configuration page")
	public void fill_all_required_field_of_consent_configuration_page(DataTable dataTable) throws InterruptedException {
	
		vBankConsentConfiguration.add_New_Consent_Button();
		Thread.sleep(3000);
		vBankConsentConfiguration.enter_Consent_Name();
		
	    List<String> consentDetails = dataTable.asList();
		String consentNotice = consentDetails.get(0);
		
		vBankConsentConfiguration.enter_Consent_Notice(consentNotice);
		vBankConsentConfiguration.save_Button();
		Thread.sleep(2000);
		vBankConsentConfiguration.next_Button();
		Thread.sleep(5000);
		
		
	}
	@Then("Fill all the required field on Publish App page.")
	public void fill_all_the_required_field_on_publish_app_page(DataTable dataTable) throws InterruptedException {
		
		List<List<String>> publishData = dataTable.asLists();

	    String releaseName = publishData.get(0).get(0); // "First Release"
	    String releasecomment = publishData.get(1).get(0);
	    
	    vBankPublishApp.publish_Release_Name(releaseName);
	    vBankPublishApp.publish_Comment(releasecomment);
	    vBankPublishApp.publish_To_Sandbox();
	    Thread.sleep(2000);
	    vBankPublishApp.yes_Publish();
	    Thread.sleep(2000);
	  
	    String actualMessage = vBankPublishApp.success_Msg();
	    String expectedMessage = "Your App has been successfully Published to Sandbox.";
	    org.testng.Assert.assertEquals(actualMessage, expectedMessage, "Your App has not been successfully Published to Sandbox.");
	   
	}

}
