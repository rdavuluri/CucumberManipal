package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"json:reports/cucumber-report/cucumber.json", "html:reports/cucumber-report/cucumber.html",
				"pretty"},
		tags={"@Regression"},
		features="res/features",
		glue={"stepDefination"},
		monochrome=true,
		strict = true
		)

public class TestRunner {

}
