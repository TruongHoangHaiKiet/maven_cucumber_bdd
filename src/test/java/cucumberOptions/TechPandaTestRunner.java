package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/TechPanda/features",
        glue = "TechPanda.stepDefinitions",
//        dryRun = true,
        monochrome = true,
        plugin = {"pretty", "html:target/site/cucumber-report-default", "json:target/site/cucumber.json"},
        snippets = SnippetType.CAMELCASE,
        tags = {"@Register_and_Login"}
)

public class TechPandaTestRunner {
}
