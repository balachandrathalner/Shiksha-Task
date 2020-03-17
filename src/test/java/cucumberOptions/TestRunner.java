package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinations", tags = { "@sprint" }, plugin = {
		"pretty", "html:target/cucumber-html", "junit:target/ccumber-xml",
		"json:target/cucumber-json" }, monochrome = true)

public class TestRunner {

}
