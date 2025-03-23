package runnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = {"stepDefinitions","hooks"},// Package containing step definitions
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html", // HTML report
                "json:target/cucumber-reports/cucumber.json" // JSON report
        },
        monochrome = true, // Makes the console output more readable
        tags = "@Become_a_Seller", // Define the tag to execute specific scenarios
        snippets = CucumberOptions.SnippetType.CAMELCASE // Generate step definitions in camel case
)
public class FlipkartRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false) // Enables parallel execution
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
