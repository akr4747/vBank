package pageObjects;

import org.openqa.selenium.WebDriver;

import stepDefinitions.VHubExploreUseCasesSD;


public class PageObjectManager {
	

	public VHubLandingPage vHubLandingPage;
	public VBankLandingPage vBankLandingPage;
	public AssetDetailPage assetDetailPage;
	public VBankAppSettings vBankAppSettings;
	public VBankConsentConfiguration vBankConsentConfiguration;
	public VBankPublishApp vBankPublishApp;
	public VHubExploreUseCasesSD vHubExploreUseCases;
	public WebDriver driver;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public VHubLandingPage getVHubLandingPage()
	{
	 vHubLandingPage= new VHubLandingPage(driver);
	 return vHubLandingPage;
	}
	
	public VBankLandingPage getVBankLandingPage() {
		vBankLandingPage=new VBankLandingPage(driver);
		return vBankLandingPage;
	}
	
	public AssetDetailPage getAssetDetailPage() {
		
		assetDetailPage=new AssetDetailPage(driver);
		return assetDetailPage;
	}
	
	public  VBankAppSettings getVBankAppSettings() {
		vBankAppSettings =new VBankAppSettings(driver);
		return vBankAppSettings;
	}
	
	public VBankConsentConfiguration getVBankConsentConfiguration() {
		vBankConsentConfiguration =new VBankConsentConfiguration(driver);
		return vBankConsentConfiguration;
	}
	
	public VBankPublishApp getVBankPublishApp() {
		vBankPublishApp = new VBankPublishApp(driver);
		return vBankPublishApp;
	}


}
