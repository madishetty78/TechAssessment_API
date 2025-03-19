package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(glue = "stepdefs",
		         tags = {"@Regression"},
		         plugin = {"pretty","json:target/json-cucumber-reports/Cucumber.json","html:target/cucumber-reports" },
		         features = "src/test/resources/features/",
		         dryRun=false,
		         monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
