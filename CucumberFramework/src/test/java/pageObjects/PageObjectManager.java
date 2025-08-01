package pageObjects;

import org.openqa.selenium.WebDriver;
import stepDefinitions.VHubExploreUseCasesSD;


public class PageObjectManager {

	public VHubLandingPage vHubLandingPage;
	public VBankLandingPage vBankLandingPage;
	public VHubAssetDetailPage vHubAssetDetailPage;
	public VBankAppSettings vBankAppSettings;
	public VBankConsentConfiguration vBankConsentConfiguration;
	public VBankPublishApp vBankPublishApp;
	public VHubExploreUseCasesSD vHubExploreUseCases;
	public VHubDashboard vHubAccountDetails;
	public VHubMySubscriptions vHubMySubscriptions;
	public APIAssetDetailPage apiAssetDetailPage;
	public VHubFooter vHubFooter;

	public WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public VHubLandingPage getVHubLandingPage() {
		vHubLandingPage = new VHubLandingPage(driver);
		return vHubLandingPage;
	}

	public VBankLandingPage getVBankLandingPage() {
		vBankLandingPage = new VBankLandingPage(driver);
		return vBankLandingPage;
	}

	public VHubAssetDetailPage getVHubAssetDetailPage() {

		vHubAssetDetailPage = new VHubAssetDetailPage(driver);
		return vHubAssetDetailPage;
	}

	public VBankAppSettings getVBankAppSettings() {
		vBankAppSettings = new VBankAppSettings(driver);
		return vBankAppSettings;
	}

	public VBankConsentConfiguration getVBankConsentConfiguration() {
		vBankConsentConfiguration = new VBankConsentConfiguration(driver);
		return vBankConsentConfiguration;
	}

	public VBankPublishApp getVBankPublishApp() {
		vBankPublishApp = new VBankPublishApp(driver);
		return vBankPublishApp;
	}

	public VHubDashboard getVHubAccountDetails() {
		vHubAccountDetails = new VHubDashboard(driver);
		return vHubAccountDetails;
	}

	public VHubMySubscriptions getVhubMySubscriptions() {
		vHubMySubscriptions =new VHubMySubscriptions(driver);
		return vHubMySubscriptions;
	}

	public APIAssetDetailPage getapiAssetDetailPage() {
		apiAssetDetailPage =new APIAssetDetailPage(driver);
		return apiAssetDetailPage;
	}

	public VHubFooter getVHubFooter() {
		vHubFooter=new VHubFooter(driver);
		return vHubFooter;
	}


	

}
