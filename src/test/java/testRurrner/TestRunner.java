package testRurrner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		/*
		 * Note: 1. Verify the the path of the feature cucumber option before running
		 * the runner class 2. Verify the path of the configuration file before running
		 * the runner class.
		 */

		features = "D:\\ProjectsWorkspace\\CucumberPOM\\CucumberPOM\\src\\test\\java\\com\\qa\\features\\walmart.feature", 
		glue = "stepDefinitions", 
		plugin = {
				"pretty", "html:test-output",
				"junit:test-output/cucumber.xml" }, 
		dryRun = false, 
		monochrome = true)
// tags = {"@EndtoEnd", "~@Regression", "~@Smoke"})

public class TestRunner {

}
