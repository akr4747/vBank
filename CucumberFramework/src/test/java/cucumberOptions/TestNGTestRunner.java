package cucumberOptions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;

@CucumberOptions(features="src/test/java/features",glue ="stepDefinitions"
,monochrome=true, tags ="@vBank or @vHub", dryRun = false,
plugin= {"html:target/cucumber.html", "json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"rerun:target/failed_scenarios.txt"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

/*	@Override
	@DataProvider(parallel=true between the header and Profile Detail)
	public Object[][] scenarios()
	{
		return super.scenarios();
	} */
	
// To Run the specific test cases multiple time	
	
	 @Test(dataProvider = "scenarios")
	    public void runScenario(PickleWrapper pickle, FeatureWrapper feature) {
	        boolean isRepeatScenario = pickle.getPickle().getTags().contains("@repeat");

	        if (isRepeatScenario) {
	            for (int i = 1; i <= 1; i++) {
	                System.out.println("Executing @repeat scenario: Iteration " + i);
	                try {
	                    super.runScenario(pickle, feature);
	                } catch (Exception e) {
	                    // Let it fail but continue with next iterations
	                    System.err.println("Iteration " + i + " failed: " + e.getMessage());
	                }
	            }
	        } else {
	            super.runScenario(pickle, feature);
	        }
	    }
}
