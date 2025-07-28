package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.netty.handler.timeout.TimeoutException;
import utils.GenericUtils;

public class VHubMySubscriptions {

	public WebDriver driver;
	public WebDriverWait wait;
    public GenericUtils genericUtils;

	public VHubMySubscriptions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		this.genericUtils = new GenericUtils(driver); 
	}

	private By exploreAssets = By.xpath("//button[contains(@class, 'asset-btn') and normalize-space()='Explore Assets']");

	private By exploreUseCase = By.xpath("//span[text()='Explore Use Cases']");

	private By requestSubmitted = By.xpath("//div[@class='popup-header']/h5[normalize-space()='Request Submitted']");

	@FindBy(xpath = "//button[@class='confirm-button']")
	private WebElement viewAdditionalDetails;

	private By assetDetails = By.xpath("//span[@class='highlight']");

	@FindBy(xpath = "//button[@class='close-button']")
	private WebElement closePopUp;

	@FindBy(xpath = "//div[@class='empty-content']/h2")
	private WebElement noResultFound;

	private By filterLiveStatus = By.xpath("//mat-select[@placeholder='Status']");

	@FindBy(xpath = "(//div[@class='mat-mdc-menu-trigger action-menu-container ng-star-inserted'])[1]")
	private WebElement actionButton;

	private By firstRowAssetName = By.xpath("//tbody[@class='mdc-data-table__content ng-star-inserted']//tr[1]/td[1]");

	// Service Up

	private By allStatusOptions = By.xpath("//mat-option//span[@class='mdc-list-item__primary-text']");

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='View Details']")
	private WebElement seriveUpViewDetails;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='Request Support']")
	private WebElement seriveUpRequestSupport;

	@FindBy(xpath = "//input[@formcontrolname='subject']")
	private WebElement seriveUpRequestSupportSubject;

	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	private WebElement seriveUpRequestSupportDescription;

	@FindBy(xpath = "//button[text()='Browse']")
	private WebElement seriveUpRequestSupportFileUpload;

	@FindBy(xpath = "//button[.//span[normalize-space()='Submit Request']]")
	private WebElement seriveUpRequestSupportSubmitRequest;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='Request Production (Live)']")
	private WebElement serviceUpRequestProduction;

	@FindBy(xpath = "//button[.//span[normalize-space()='Submit Request']]")
	private WebElement serviceUpProductionSubmitRequest;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='Request Unsubscribe']")
	private WebElement serviceUpRequestUnsubscribe;

	@FindBy(xpath = "//textarea[@formcontrolname='reason']")
	private WebElement serviceUpRequestUnsubscribeReason;

	@FindBy(xpath = "(//button//span[@class='mdc-button__label'])[2]")
	private WebElement serviceUpRequestUnsubscribeSubmitRequest;

	// Service Down

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='View Details']")
	private WebElement seriveDownViewDetails;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='Request Support']")
	private WebElement seriveDownRequestSupport;

	@FindBy(xpath = "//input[@formcontrolname='subject']")
	private WebElement seriveDownRequestSupportSubject;

	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	private WebElement seriveDownRequestSupportDescription;

	@FindBy(xpath = "//button[text()='Browse']")
	private WebElement seriveDownRequestSupportFileUpload;

	@FindBy(xpath = "//button[.//span[normalize-space()='Submit Request']]")
	private WebElement seriveDownRequestSupportSubmitRequest;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='Request Production (Live)']")
	private WebElement serviceDownRequestProduction;

	@FindBy(xpath = "//button[.//span[normalize-space()='Submit Request']]")
	private WebElement serviceDownProductionSubmitRequest;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='Request Unsubscribe']")
	private WebElement serviceDownRequestUnsubscribe;

	@FindBy(xpath = "//textarea[@formcontrolname='reason']")
	private WebElement serviceDownRequestUnsubscribeReason;

	@FindBy(xpath = "(//button//span[@class='mdc-button__label'])[2]")
	private WebElement serviceDownRequestUnsubscribeSubmitRequest;

	// Credit Expired

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='View Details']")
	private WebElement creditExpiredViewDetails;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='Request Credits']")
	private WebElement creditExpiredRequestCredits;

	@FindBy(xpath = "//input[@formcontrolname='numberOfCredits']")
	private WebElement creditExpiredRequestCreditsNumberOfCredits;

	@FindBy(xpath = "//textarea[@formcontrolname='purpose']")
	private WebElement creditExpiredRequestCreditPurpose;

	@FindBy(xpath = "(//span[@class='mdc-button__label'])[3]")
	private WebElement creditExpiredRequestCreditSubmitRequest;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='Request Support']")
	private WebElement creditExpiredRequestSupport;

	@FindBy(xpath = "//input[@formcontrolname='subject']")
	private WebElement creditExpiredRequestSupportSubject;

	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	private WebElement creditExpiredRequestSupportDescription;

	@FindBy(xpath = "//button[text()='Browse']")
	private WebElement creditExpiredRequestSupportFileUpload;

	@FindBy(xpath = "//button[.//span[normalize-space()='Submit Request']]")
	private WebElement creditExpiredRequestSupportSubmitRequest;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='Request Production (Live)']")
	private WebElement creditExpiredRequestProduction;

	@FindBy(xpath = "//button[.//span[normalize-space()='Submit Request']]")
	private WebElement creditExpiredProductionSubmitRequest;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='Request Unsubscribe']")
	private WebElement creditExpiredRequestUnsubscribe;

	@FindBy(xpath = "//textarea[@formcontrolname='reason']")
	private WebElement creditExpiredRequestUnsubscribeReason;

	@FindBy(xpath = "(//button//span[@class='mdc-button__label'])[2]")
	private WebElement creditExpiredRequestUnsubscribeSubmitRequest;

	// Depricate

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='View Details']")
	private WebElement deprecateViewDetails;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='Request Support']")
	private WebElement deprecateRequestSupport;

	@FindBy(xpath = "//input[@formcontrolname='subject']")
	private WebElement deprecateRequestSupportSubject;

	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	private WebElement deprecateRequestSupportDescription;

	@FindBy(xpath = "//button[text()='Browse']")
	private WebElement deprecateRequestSupportFileUpload;

	@FindBy(xpath = "//button[.//span[normalize-space()='Submit Request']]")
	private WebElement deprecateRequestSupportSubmitRequest;

	@FindBy(xpath = "//span[@class='mat-mdc-menu-item-text' and normalize-space(text())='Request Unsubscribe']")
	private WebElement deprecateRequestUnsubscribe;

	@FindBy(xpath = "//textarea[@formcontrolname='reason']")
	private WebElement deprecateRequestUnsubscribeReason;

	@FindBy(xpath = "(//button//span[@class='mdc-button__label'])[2]")
	private WebElement deprecateRequestUnsubscribeSubmitRequest;

	// Service Up View Details
	public void clickOnServiceUpViewDetails() {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
		//		System.out.println("Exception checking Explore Assets visibility: " + e.getMessage());
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");

		//		System.out.println("Explore Assets flow handled successfully.");
				return;
			} else {
	//			System.out.println("'Explore Assets' not found. Proceeding with Deprecated filter...");
				genericUtils.waitForDOMToStabilize(2);
			}

			//  Apply Live Status → Deprecated filter
			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Service Up")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Service Up' option not found in Live Status filter.");
			}

	//		System.out.println("Selected 'Service Up' filter.");
			genericUtils.waitForDOMToStabilize(2);

			// Now check if there is any result row or "No Results"
			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {
				String assetName = assetRows.get(0).getText().trim();
		//		System.out.println("Asset found in table: " + assetName);

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
		//		System.out.println("Clicked on Action button.");
				wait.until(ExpectedConditions.elementToBeClickable(seriveUpViewDetails)).click();

			 // shortWait.until(ExpectedConditions.elementToBeClickable(viewAdditionalDetails)).click();

		   	//  WebElement asset =shortWait.until(ExpectedConditions.visibilityOfElementLocated(assetDetails));
			//  String actualResult = asset.getText().trim();
			//  Assert.assertEquals(actualResult, "Asset Details", "Not Redirect to Asset Details Page");

			} else {
				// ✅ No results case
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	// Service Up Request Support
	public void clickOnseriveUpRequestSupport(DataTable dataTable) {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}

			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Service Up")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Service Down' option not found in Live Status filter.");
			}
			genericUtils.waitForDOMToStabilize(2);
			
			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {
				String assetName = assetRows.get(0).getText().trim();
				System.out.println("Asset found in table: " + assetName);

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(seriveUpRequestSupport)).click();

				List<String> requestSupportData = dataTable.asList();

				String subject = requestSupportData.get(0);
				String Description = requestSupportData.get(1);

				wait.until(ExpectedConditions.visibilityOf(seriveUpRequestSupportSubject)).sendKeys(subject);
				wait.until(ExpectedConditions.visibilityOf(seriveUpRequestSupportDescription)).sendKeys(Description);
				wait.until(ExpectedConditions.elementToBeClickable(seriveUpRequestSupportSubmitRequest)).click();

				WebElement submittedPopup = shortWait
						.until(ExpectedConditions.visibilityOfElementLocated(requestSubmitted));
				String submit = submittedPopup.getText().trim();

				Assert.assertEquals(submit, "Request Submitted", "Popup message mismatch.");
				closePopUp.click();

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	}

	// Service Up Production
	public void clickOnseriveUpRequestProduction() {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}
			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Service Up")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Service Up' option not found in Live Status filter.");
			}

			genericUtils.waitForDOMToStabilize(2);

			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(serviceUpRequestProduction)).click();
				wait.until(ExpectedConditions.elementToBeClickable(serviceUpProductionSubmitRequest)).click();

				WebElement submittedPopup = shortWait
						.until(ExpectedConditions.visibilityOfElementLocated(requestSubmitted));
				String submit = submittedPopup.getText().trim();

				Assert.assertEquals(submit, "Request Submitted", "Popup message mismatch.");
				closePopUp.click();

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	}

	// Service Up Request Unsubscribe
	public void clickOnseriveUpRequestUnscribe(DataTable dataTable) {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}

			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Service Up")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Service Down' option not found in Live Status filter.");
			}

			genericUtils.waitForDOMToStabilize(2);

			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(serviceUpRequestUnsubscribe)).click();

				List<String> reasonData = dataTable.asList();
				String subject = reasonData.get(0);

				wait.until(ExpectedConditions.visibilityOf(serviceUpRequestUnsubscribeReason)).sendKeys(subject);
				wait.until(ExpectedConditions.elementToBeClickable(serviceUpRequestUnsubscribeSubmitRequest)).click();

				WebElement submittedPopup = shortWait
						.until(ExpectedConditions.visibilityOfElementLocated(requestSubmitted));
				String submit = submittedPopup.getText().trim();

				Assert.assertEquals(submit, "Request Submitted", "Popup message mismatch.");
				closePopUp.click();

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	}

	// ======================= Live Status: Service Down =======================

	// Service Down View Details
	public void clickOnServiceDownViewDetails() {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
				System.out.println("Exception checking Explore Assets visibility: " + e.getMessage());
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}
			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Service Down")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Service Down' option not found in Live Status filter.");
			}

			genericUtils.waitForDOMToStabilize(2);

			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(seriveDownViewDetails)).click();

				// shortWait.until(ExpectedConditions.elementToBeClickable(viewAdditionalDetails)).click();

				// WebElement asset =
				// shortWait.until(ExpectedConditions.visibilityOfElementLocated(assetDetails));
				// String actualResult = asset.getText().trim();
				// Assert.assertEquals(actualResult, "Asset Details", "Not Redirect to Asset
				// Detils Page");

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	// Service Down Request Support
	public void clickOnseriveDownRequestSupport(DataTable dataTable) {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;
			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}

			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Service Down")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Service Down' option not found in Live Status filter.");
			}

			genericUtils.waitForDOMToStabilize(2);

			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(seriveDownRequestSupport)).click();

				List<String> requestSupportData = dataTable.asList();

				String subject = requestSupportData.get(0);
				String Description = requestSupportData.get(1);

				wait.until(ExpectedConditions.visibilityOf(seriveDownRequestSupportSubject)).sendKeys(subject);
				wait.until(ExpectedConditions.visibilityOf(seriveDownRequestSupportDescription)).sendKeys(Description);
				wait.until(ExpectedConditions.elementToBeClickable(seriveDownRequestSupportSubmitRequest)).click();

				WebElement submittedPopup = shortWait
						.until(ExpectedConditions.visibilityOfElementLocated(requestSubmitted));
				String submit = submittedPopup.getText().trim();

				Assert.assertEquals(submit, "Request Submitted", "Popup message mismatch.");
				closePopUp.click();

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	// Service Down Production
	public void clickOnseriveDownRequestProduction() {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
				System.out.println("Exception checking Explore Assets visibility: " + e.getMessage());
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}

			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Service Down")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Service Down' option not found in Live Status filter.");
			}

			genericUtils.waitForDOMToStabilize(2);
			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(serviceDownRequestProduction)).click();
				wait.until(ExpectedConditions.elementToBeClickable(serviceDownProductionSubmitRequest)).click();

				WebElement submittedPopup = shortWait
						.until(ExpectedConditions.visibilityOfElementLocated(requestSubmitted));
				String submit = submittedPopup.getText().trim();

				Assert.assertEquals(submit, "Request Submitted", "Popup message mismatch.");
				closePopUp.click();

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	}

	// Service Down Request Unsubscribe
	public void clickOnseriveDownRequestUnscribe(DataTable dataTable) {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");

				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}

			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Service Down")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Service Down' option not found in Live Status filter.");
			}

			genericUtils.waitForDOMToStabilize(2);

			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				System.out.println("Clicked on Action button.");
				wait.until(ExpectedConditions.elementToBeClickable(serviceDownRequestUnsubscribe)).click();

				List<String> reasonData = dataTable.asList();
				String subject = reasonData.get(0);

				wait.until(ExpectedConditions.visibilityOf(serviceDownRequestUnsubscribeReason)).sendKeys(subject);
				wait.until(ExpectedConditions.elementToBeClickable(serviceDownRequestUnsubscribeSubmitRequest)).click();

				WebElement submittedPopup = shortWait
						.until(ExpectedConditions.visibilityOfElementLocated(requestSubmitted));
				String submit = submittedPopup.getText().trim();

				Assert.assertEquals(submit, "Request Submitted", "Popup message mismatch.");
				closePopUp.click();

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	// Credit Expired View Details
	public void clickOnCreditExpiredViewDetails() {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}

			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Credits Expired")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Deprecated' option not found in Live Status filter.");
			}

			genericUtils.waitForDOMToStabilize(2);

			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(creditExpiredViewDetails)).click();

				// shortWait.until(ExpectedConditions.elementToBeClickable(viewAdditionalDetails)).click();

				// WebElement asset =
				// shortWait.until(ExpectedConditions.visibilityOfElementLocated(assetDetails));
				// String actualResult = asset.getText().trim();
				// Assert.assertEquals(actualResult, "Asset Details", "Not Redirect to Asset
				// Detils Page");

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	// Credit Expired Request Credit
	public void clickOnCreditExpiredRequestCredit(DataTable dataTable) {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}

			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Credits Expired")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Credit Expired' option not found in Live Status filter.");
			}
			genericUtils.waitForDOMToStabilize(2);

			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(creditExpiredRequestCredits)).click();

				List<String> requestSupportData = dataTable.asList();

				String numberofCredit = requestSupportData.get(0);
				String creditPurpose = requestSupportData.get(1);

				wait.until(ExpectedConditions.visibilityOf(creditExpiredRequestCreditsNumberOfCredits))
						.sendKeys(numberofCredit);
				wait.until(ExpectedConditions.visibilityOf(creditExpiredRequestCreditPurpose)).sendKeys(creditPurpose);
				wait.until(ExpectedConditions.elementToBeClickable(creditExpiredRequestSupportSubmitRequest)).click();

				WebElement submittedPopup = shortWait
						.until(ExpectedConditions.visibilityOfElementLocated(requestSubmitted));
				String submit = submittedPopup.getText().trim();

				Assert.assertEquals(submit, "Request Submitted", "Popup message mismatch.");
				closePopUp.click();

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	}

	// Credit Expired Request Support
	public void clickOnCreditExpiredRequestSupport(DataTable dataTable) {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}
			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Credits Expired")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Credit Expired' option not found in Live Status filter.");
			}
			genericUtils.waitForDOMToStabilize(2);
			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(creditExpiredRequestSupport)).click();

				List<String> requestSupportData = dataTable.asList();

				String subject = requestSupportData.get(0);
				String Description = requestSupportData.get(1);

				wait.until(ExpectedConditions.visibilityOf(creditExpiredRequestSupportSubject)).sendKeys(subject);
				wait.until(ExpectedConditions.visibilityOf(creditExpiredRequestSupportDescription))
						.sendKeys(Description);
				wait.until(ExpectedConditions.elementToBeClickable(creditExpiredRequestSupportSubmitRequest)).click();

				WebElement submittedPopup = shortWait
						.until(ExpectedConditions.visibilityOfElementLocated(requestSubmitted));
				String submit = submittedPopup.getText().trim();

				Assert.assertEquals(submit, "Request Submitted", "Popup message mismatch.");
				closePopUp.click();

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	// Credit Expired Production
	public void clickOnCreditExpiredRequestProduction() {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}

			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Credits Expired")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Credits Expired' option not found in Live Status filter.");
			}
			genericUtils.waitForDOMToStabilize(2);

			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();

				wait.until(ExpectedConditions.elementToBeClickable(creditExpiredRequestProduction)).click();
				wait.until(ExpectedConditions.elementToBeClickable(creditExpiredProductionSubmitRequest)).click();

				WebElement submittedPopup = shortWait
						.until(ExpectedConditions.visibilityOfElementLocated(requestSubmitted));
				String submit = submittedPopup.getText().trim();

				Assert.assertEquals(submit, "Request Submitted", "Popup message mismatch.");
				closePopUp.click();

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

	}

	// Credit Expired Request Unsubscribe
	public void clickOnCreditExpiredRequestUnscribe(DataTable dataTable) {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {

			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");

				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}

			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Credits Expired")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Credits Expired' option not found in Live Status filter.");
			}
			genericUtils.waitForDOMToStabilize(2);

			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {
				String assetName = assetRows.get(0).getText().trim();
				System.out.println("Asset found in table: " + assetName);

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				System.out.println("Clicked on Action button.");
				wait.until(ExpectedConditions.elementToBeClickable(creditExpiredRequestUnsubscribe)).click();

				List<String> reasonData = dataTable.asList();
				String subject = reasonData.get(0);

				wait.until(ExpectedConditions.visibilityOf(creditExpiredRequestUnsubscribeReason)).sendKeys(subject);
				wait.until(ExpectedConditions.elementToBeClickable(creditExpiredRequestUnsubscribeSubmitRequest))
						.click();

				WebElement submittedPopup = shortWait
						.until(ExpectedConditions.visibilityOfElementLocated(requestSubmitted));
				String submit = submittedPopup.getText().trim();

				Assert.assertEquals(submit, "Request Submitted", "Popup message mismatch.");

				closePopUp.click();

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	// Depricate View Details
	public void clickOnDepricateViewDetails() {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {

			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}

			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Deprecated")) {
					option.click();
					optionFound = true;
					break;
				}
			}

			if (!optionFound) {
				Assert.fail("'Deprecated' option not found in Live Status filter.");
			}
			genericUtils.waitForDOMToStabilize(2);

			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(deprecateViewDetails)).click();

				// shortWait.until(ExpectedConditions.elementToBeClickable(viewAdditionalDetails)).click();
				// WebElement asset = shortWait.until(ExpectedConditions.visibilityOfElementLocated(assetDetails));
				// String actualResult = asset.getText().trim();
				// Assert.assertEquals(actualResult, "Asset Details", "Not Redirect to Asset Detils Page");

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}

		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	// Depricate Request Support
	public void clickOnDepricateRequestSupport(DataTable dataTable) {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
				System.out.println("Exception checking Explore Assets visibility: " + e.getMessage());
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}
			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Deprecated")) {
					option.click();
					optionFound = true;
					break;
				}
			}
			if (!optionFound) {
				Assert.fail("'Deprecated' option not found in Live Status filter.");
			}
			genericUtils.waitForDOMToStabilize(2);
			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				System.out.println("Clicked on Action button.");
				wait.until(ExpectedConditions.elementToBeClickable(deprecateRequestSupport)).click();

				List<String> requestSupportData = dataTable.asList();

				String subject = requestSupportData.get(0);
				String Description = requestSupportData.get(1);

				wait.until(ExpectedConditions.visibilityOf(deprecateRequestSupportSubject)).sendKeys(subject);
				wait.until(ExpectedConditions.visibilityOf(deprecateRequestSupportDescription)).sendKeys(Description);
				wait.until(ExpectedConditions.elementToBeClickable(deprecateRequestSupportSubmitRequest)).click();

				WebElement submittedPopup = shortWait
						.until(ExpectedConditions.visibilityOfElementLocated(requestSubmitted));
				String submit = submittedPopup.getText().trim();
				Assert.assertEquals(submit, "Request Submitted", "Popup message mismatch.");
				closePopUp.click();

			} else {
				try {
					WebElement noResult = shortWait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}
		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

	// Depricate Request Unsubscribe
	public void clickOnDepricateRequestUnscribe(DataTable dataTable) {
		WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		try {
			boolean explorePresent = false;

			try {
				explorePresent = isElementVisible(exploreAssets, shortWait);
			} catch (Exception e) {
				System.out.println("Exception checking Explore Assets visibility: " + e.getMessage());
			}

			if (explorePresent) {
				driver.findElement(exploreAssets).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(exploreUseCase));
				String actualText = driver.findElement(exploreUseCase).getText().trim();
				Assert.assertEquals(actualText, "Explore Use Cases", "Explore button text mismatch.");
				return;
			} else {
				genericUtils.waitForDOMToStabilize(2);
			}
			WebElement liveStatusFilter = wait.until(ExpectedConditions.presenceOfElementLocated(filterLiveStatus));

			if (liveStatusFilter.isDisplayed() && liveStatusFilter.isEnabled()) {
				liveStatusFilter.click();
			} else {
				Assert.fail("Live Status filter is not clickable.");
			}

			List<WebElement> options = wait
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(allStatusOptions));
			boolean optionFound = false;

			for (WebElement option : options) {
				if (option.getText().trim().equalsIgnoreCase("Deprecated")) {
					option.click();
					optionFound = true;
					break;
				}
			}
			if (!optionFound) {
				Assert.fail("'Deprecated' option not found in Live Status filter.");
			}
			genericUtils.waitForDOMToStabilize(2);

			List<WebElement> assetRows = driver.findElements(firstRowAssetName);

			if (!assetRows.isEmpty() && assetRows.get(0).isDisplayed()) {

				wait.until(ExpectedConditions.elementToBeClickable(actionButton)).click();
				wait.until(ExpectedConditions.elementToBeClickable(deprecateRequestUnsubscribe)).click();

				List<String> reasonData = dataTable.asList();
				String subject = reasonData.get(0);

				wait.until(ExpectedConditions.visibilityOf(deprecateRequestUnsubscribeReason)).sendKeys(subject);
				wait.until(ExpectedConditions.elementToBeClickable(deprecateRequestUnsubscribeSubmitRequest)).click();

				WebElement submittedPopup = shortWait
						.until(ExpectedConditions.visibilityOfElementLocated(requestSubmitted));
				String submit = submittedPopup.getText().trim();
				Assert.assertEquals(submit, "Request Submitted", "Popup message mismatch.");
				closePopUp.click();
			} else {

				try {
					WebElement noResult = shortWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='empty-content']/h2")));
					String msg = noResult.getText().trim();
					Assert.assertEquals(msg, "No Results Found", "Expected 'No Results Found' not shown.");
				} catch (TimeoutException e) {
					Assert.fail("'No Results Found' message not visible after applying filter.");
				}
			}
		} catch (Exception e) {
			Assert.fail("Exception occurred while processing Explore Assets or Live Status logic: " + e.getMessage());
		} finally {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}

//Helper method
	public boolean isElementVisible(By locator, WebDriverWait wait) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			return true;
		} catch (TimeoutException | NoSuchElementException e) {
			return false;
		}
	}

	public boolean isElementVisible(WebElement element, WebDriverWait customWait) {
		try {
			customWait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (TimeoutException e) {
			return false;
		}
	}	
}