package testrunner.java;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (

		features = "src/test/resources/scenarionout.feature",
		glue = "org.stepdefinition",
		dryRun = false,
		plugin = {"pretty","junit:target/cucumber.xml"}

		
		
		//plugin = {"pretty","json:target/cucumber.json"}

		
		
		//plugin = {"pretty","html:target/cucumber-reports.html"}

		
		//plugin = {"usage"}
		
		//plugin = {"pretty"}

		


)

public class runner {

}
