package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/workspaceSprint13/CucumerAutomation/src/main/java/Features/tagging.feature",
		glue={"stepDefinitions"},
		plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false,
		//tags = {"@End2End"}
		//tags = {"@SmokeTest","@RegressionTest"}
	    tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
		)
public class TestRunner {

}
