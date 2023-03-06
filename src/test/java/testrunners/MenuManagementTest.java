package testrunners;

import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/features", glue = { "stepdefinitions", "hooks" }, tags = "@Menu")
@CucumberOptions(features = "src/test/java/features", glue = { "stepdefinitions" }, plugin = { "pretty",
		"html:target/SystemTestReports/html", "json:target/SystemTestReports/json/report.json",

		"junit:target/SystemTestReports/junit/report.xml" }, tags = "@GoogleSeach", dryRun = false, monochrome = true)
public class MenuManagementTest {

}
