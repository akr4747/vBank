package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public LandingPage landingPage;
	public OffersPage offersPage;
	public WebDriver driver;
	public CheckoutPage checkoutPage;
	public LoginPage loginPage;
	public CreateAccountPage createAccountPage;
	public CreateUserAndRolesPage createUserAndRolesPage;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LandingPage getLandingPage()
	{
	
	 landingPage= new LandingPage(driver);
	 return landingPage;
	}
	
	public OffersPage OffersPage()
	{
		offersPage = new OffersPage(driver);
		return offersPage;
	}
	
	public CheckoutPage getCheckoutPage()
	{
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}
	
	public LoginPage getLoginPage()
	{
	 loginPage= new LoginPage(driver);
	 return loginPage;
	}
	
	public CreateAccountPage getCreateAccountPage() {
		createAccountPage=new CreateAccountPage(driver);
		return createAccountPage;
	}
	
	public CreateUserAndRolesPage getCreateUserAndRolesPage() {
		createUserAndRolesPage=new CreateUserAndRolesPage(driver);
		return createUserAndRolesPage;
	}
}
