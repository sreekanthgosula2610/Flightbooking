package Testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
	(
			tags = "", 
			dryRun = true,
			//monochrome = true,
			features = ".//Features/Flightbooking.feature",
			glue = {"stepDefinition"},
			plugin= { "pretty", 
			           "json:target/cucumber-report/cucumber.json",
		               "html:target/Cucumber_Reports/report.html"}
		)

public class TestRun extends AbstractTestNGCucumberTests {

}