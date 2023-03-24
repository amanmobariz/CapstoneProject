package tek.sdet.framework.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@orderReview",
		features = "classpath:features", // this is path to features folder
		glue ="tek.sdet.framework",
		dryRun = true,
		plugin = { 
                "pretty",
                "html:target/htmlReports/cucumber-pretty.html",
                "json:target/jsonReports/cucumber.json"
		},
		snippets = CAMELCASE,
		monochrome = true
		)
public class TestRunner {

}

