package StepDefinations;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/AutomationPractiseSearch.feature", glue = {"StepDefinations"},
monochrome = true,
plugin = {"pretty", "html:target/HtmlReports", "json:target/JSONReports/report.json", "junit:target/jUnitReports/report.xml"}
		)
public class TestRunner {

}
