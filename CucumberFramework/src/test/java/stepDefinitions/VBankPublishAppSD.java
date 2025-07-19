package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

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
import utils.TestData;

public class VBankPublishAppSD {

	TestContextSetup testContextSetup;
	VHubLandingPage vHubLandingPage;
	VHubAssetDetailPage vHubAssetDetailPage;
	VBankLandingPage vBankLandingPage;
	VBankAppSettings vBankAppSettings;
	VBankConsentConfiguration vBankConsentConfiguration;
	VBankPublishApp vBankPublishApp;
	
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
		vHubLandingPage.enterAssetNameOnSearchBox(TestData.ASSET_NAME_CONSENT);
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
		vHubLandingPage.click_On_vConsent_Card(TestData.ASSET_NAME_CONSENT);
		 boolean shouldSwitchWindow = vHubAssetDetailPage.clickExperienceOrConfigureApp();

		    if (shouldSwitchWindow) {
		        testContextSetup.genericUtils.SwitchWindowToChild(); // only when "Configure App"
		    } else {
		        // When "Experience for Free" is clicked, we wait in that method itself for redirection
		        // But we should still make sure we're on the child window
		        testContextSetup.genericUtils.SwitchWindowToLastOpened();
		    }
		
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
		
		String consentDescription=consentDetails.get(0);
		String consentAudio=consentDetails.get(1);
		String consentVideo=consentDetails.get(2);
		String consentNotice = consentDetails.get(3);
		
		vBankConsentConfiguration.enterConsentDescription(consentDescription);
		
		vBankConsentConfiguration.enterConsentAudio(consentAudio);
		
		vBankConsentConfiguration.enterConsentVideo(consentVideo);

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
	
	
//	****************************************************************************************************************
	
	@Given("the user is on the vBank landing page")
	public void the_user_is_on_the_v_bank_landing_page() {
	    
		vHubLandingPage.searchTextBox();
		vHubLandingPage.enterAssetNameOnSearchBox(TestData.ASSET_NAME_CONSENT);
		vHubLandingPage.hitEnter();
		vHubLandingPage.sendEscapeKeyToSearchBox();
		vHubLandingPage.click_On_vConsent_Card(TestData.ASSET_NAME_CONSENT);
		 boolean shouldSwitchWindow = vHubAssetDetailPage.clickExperienceOrConfigureApp();

		    if (shouldSwitchWindow) {
		        testContextSetup.genericUtils.SwitchWindowToChild(); // only when "Configure App"
		    } else {
		        // When "Experience for Free" is clicked, we wait in that method itself for redirection
		        // But we should still make sure we're on the child window
		        testContextSetup.genericUtils.SwitchWindowToLastOpened();
		    }
		
	}
	@When("the user selects all languages on the App Settings page")
	public void the_user_selects_all_languages_on_the_app_settings_page() {
	    
		vBankLandingPage.create_New_App();

		vBankAppSettings.waitForAppSettingsPageToLoad();
		vBankAppSettings.enter_App_Name();
		vBankAppSettings.clickOtherLanguage();
		vBankAppSettings.selectAssamLanguage();
		vBankAppSettings.selectBengaliLanguage();
		vBankAppSettings.selectBodoLanguage();
		vBankAppSettings.selectDogriLanguage();
		vBankAppSettings.selectGujratiLanguage();
		vBankAppSettings.selectKannadaLanguage();
		vBankAppSettings.selectKashmiriLanguage();
		vBankAppSettings.selectKonkaniLanguage();
		vBankAppSettings.selectMaithiliLanguage();
		vBankAppSettings.selectMalayalamLanguage();
		vBankAppSettings.selectManipuriLanguage();
		vBankAppSettings.selectMarathiLanguage();
		vBankAppSettings.selectNepaliLanguage();
		vBankAppSettings.selectodiaLanguage();
		vBankAppSettings.selectPunjabiLanguage();
		vBankAppSettings.selectsanskritLanguage();
		vBankAppSettings.selectSantaliLanguage();
		vBankAppSettings.selectSindhiLanguage();
		vBankAppSettings.selectTamilLanguage();
		vBankAppSettings.selectTeluguLanguage();
		vBankAppSettings.selectUrduLanguage(); 
		vBankAppSettings.driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
		vBankAppSettings.effective_Date();
		vBankAppSettings.waitForCalendarToAppear();
		vBankAppSettings.current_Effective_Date();
		vBankAppSettings.driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
		vBankAppSettings.waitForNextButtonToBeClickable();
		vBankAppSettings.next_Button();
		

	}
	@Then("the user fills in all required fields on the Consent Configuration page with consent notice text in each selected language using Rich HTML")
	public void the_user_fills_in_all_required_fields_on_the_consent_configuration_page_with_consent_notice_text_in_each_selected_language_using_rich_html(io.cucumber.datatable.DataTable dataTable) {
	    
		vBankConsentConfiguration.add_New_Consent_Button();
		
		vBankConsentConfiguration.enter_Consent_Name();
		
		Map<String, String> consentDetails = dataTable.asMap(String.class, String.class);
		
		vBankConsentConfiguration.enterConsentDescription(consentDetails.get("Purpose"));
		
		vBankConsentConfiguration.clickAddLanguages();
		vBankConsentConfiguration.enterConsentAudio(consentDetails.get("Audio"));
		vBankConsentConfiguration.enterConsentVideo(consentDetails.get("Video"));
		vBankConsentConfiguration.enter_Consent_Notice1(consentDetails.get("English"));
		
		vBankConsentConfiguration.selectConsentLanguage2();
		vBankConsentConfiguration.selectConsentType2();
		vBankConsentConfiguration.enterConsentNoticeText2(consentDetails.get("Assamese"));
		
		vBankConsentConfiguration.selectConsentLanguage3();
		vBankConsentConfiguration.selectConsentType3();
		vBankConsentConfiguration.enterConsentNoticeText3(consentDetails.get("Bengali"));
		
		vBankConsentConfiguration.selectConsentLanguage4();
		vBankConsentConfiguration.selectConsentType4();
		vBankConsentConfiguration.enterConsentNoticeText4(consentDetails.get("Bodo"));
		
		vBankConsentConfiguration.selectConsentLanguage5();
		vBankConsentConfiguration.selectConsentType5();
    	vBankConsentConfiguration.enterConsentNoticeText5(consentDetails.get("Dogri"));
		
		vBankConsentConfiguration.selectConsentLanguage6();
		vBankConsentConfiguration.selectConsentType6();
		vBankConsentConfiguration.enterConsentNoticeText6(consentDetails.get("Gujrati"));
		
		vBankConsentConfiguration.selectConsentLanguage7();
		vBankConsentConfiguration.selectConsentType7();
		vBankConsentConfiguration.enterConsentNoticeText7(consentDetails.get("Hindi"));
		
		vBankConsentConfiguration.selectConsentLanguage8();
		vBankConsentConfiguration.selectConsentType8();
		vBankConsentConfiguration.enterConsentNoticeText8(consentDetails.get("Kannada"));
		
		vBankConsentConfiguration.selectConsentLanguage9();
		vBankConsentConfiguration.selectConsentType9();
		vBankConsentConfiguration.enterConsentNoticeText9(consentDetails.get("Kashmiri"));
		
		vBankConsentConfiguration.selectConsentLanguage10();
		vBankConsentConfiguration.selectConsentType10();
		vBankConsentConfiguration.enterConsentNoticeText10(consentDetails.get("Konkani"));
		
		vBankConsentConfiguration.selectConsentLanguage11();
		vBankConsentConfiguration.selectConsentType11();
		vBankConsentConfiguration.enterConsentNoticeText11(consentDetails.get("Maithili"));
		
		vBankConsentConfiguration.selectConsentLanguage12();
		vBankConsentConfiguration.selectConsentType12();
		vBankConsentConfiguration.enterConsentNoticeText12(consentDetails.get("Malayalam"));
		
		vBankConsentConfiguration.selectConsentLanguage13();
		vBankConsentConfiguration.selectConsentType13();
		vBankConsentConfiguration.enterConsentNoticeText13(consentDetails.get("Manipuri"));
		
		vBankConsentConfiguration.selectConsentLanguage14();
		vBankConsentConfiguration.selectConsentType14();
		vBankConsentConfiguration.enterConsentNoticeText14(consentDetails.get("Marathi"));
		
		vBankConsentConfiguration.selectConsentLanguage15();
		vBankConsentConfiguration.selectConsentType15();
		vBankConsentConfiguration.enterConsentNoticeText15(consentDetails.get("Nepali"));
		
		vBankConsentConfiguration.selectConsentLanguage16();
		vBankConsentConfiguration.selectConsentType16();
		vBankConsentConfiguration.enterConsentNoticeText16(consentDetails.get("Odia"));
		
		vBankConsentConfiguration.selectConsentLanguage17();
		vBankConsentConfiguration.selectConsentType17();
		vBankConsentConfiguration.enterConsentNoticeText17(consentDetails.get("Punjabi"));
		
		vBankConsentConfiguration.selectConsentLanguage18();
		vBankConsentConfiguration.selectConsentType18();
		vBankConsentConfiguration.enterConsentNoticeText18(consentDetails.get("Sanskrit"));
		
		vBankConsentConfiguration.selectConsentLanguage19();
		vBankConsentConfiguration.selectConsentType19();
		vBankConsentConfiguration.enterConsentNoticeText19(consentDetails.get("Santali"));
		
		vBankConsentConfiguration.selectConsentLanguage20();
		vBankConsentConfiguration.selectConsentType20();
		vBankConsentConfiguration.enterConsentNoticeText20(consentDetails.get("Sindhi"));
		
		vBankConsentConfiguration.selectConsentLanguage21();
		vBankConsentConfiguration.selectConsentType21();
		vBankConsentConfiguration.enterConsentNoticeText21(consentDetails.get("Tamil"));
		
		vBankConsentConfiguration.selectConsentLanguage22();
		vBankConsentConfiguration.selectConsentType22();
		vBankConsentConfiguration.enterConsentNoticeText22(consentDetails.get("Telugu"));
		
		vBankConsentConfiguration.selectConsentLanguage23();
		vBankConsentConfiguration.selectConsentType23();
		vBankConsentConfiguration.enterConsentNoticeText23(consentDetails.get("Urdu")); 
		
		vBankConsentConfiguration.save_Button();

		vBankConsentConfiguration.next_Button();
		
		
	}
	@Then("the user completes all required fields on the Publish App page")
	public void the_user_completes_all_required_fields_on_the_publish_app_page(DataTable dataTable) {
		
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
