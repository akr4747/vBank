package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.VHubAssetDetailPage;
import pageObjects.VHubLandingPage;
import utils.TestContextSetup;

public class VHubExploreAllSD {

	TestContextSetup testContextSetup;
	VHubLandingPage vHubLandingPage;
	VHubAssetDetailPage vHubAssetDetailPage;

	public VHubExploreAllSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.vHubLandingPage = testContextSetup.pageObjectManager.getVHubLandingPage();
	}

	@Given("the user is logged in and lands on the vHub Home page")
	public void the_user_is_logged_in_and_lands_on_the_v_hub_home_page() {
		vHubLandingPage.exploreUseCaseText();
	}

// First Test case
	@When("the user performs Trending Explore All")
	public void the_user_performs_trending_explore_all() {

		vHubLandingPage.clickExploreAllTrending();
	}

	@Then("the system should apply the Trending filter")
	public void the_system_should_apply_the_trending_filter() {
		vHubLandingPage.trendingLabel();
	}
// Second Test Case

	@When("the user performs Featured Explore All")
	public void the_user_performs_featured_explore_all() {
		vHubLandingPage.clickExploreAllFeatured();
	}

	@Then("the system should apply the Featured filter")
	public void the_system_should_apply_the_featured_filter() {
		vHubLandingPage.featuredLabel();
	}

// Third Test Case

	@When("the user performs Most Popular Explore All")
	public void the_user_performs_most_popular_explore_all() {
		vHubLandingPage.clickExploreAllMostPopular();
	}

	@Then("the system should apply the Most Popular filter")
	public void the_system_should_apply_the_most_popular_filter() {
		vHubLandingPage.mostPopularLabel();
	}

	// fourth Test CAse

	@When("the user performs Top Use Cases Explore All")
	public void the_user_performs_top_use_cases_explore_all() {
		vHubLandingPage.clickExploreAllTopUseCases();
	}

	@Then("the system should apply the Top Use Cases filter")
	public void the_system_should_apply_the_top_use_cases_filter() {
		vHubLandingPage.topUseCasesLabel();
	}

	// Fifth test case

	@When("the user performs Top Partners Explore All")
	public void the_user_performs_top_partners_explore_all() {
		vHubLandingPage.clickExploreAllTopPartners();
	}

	@Then("the system should apply the Top Partners filter")
	public void the_system_should_apply_the_top_partners_filter() {
		vHubLandingPage.topPartnersLabel();
	}

}
