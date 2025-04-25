

package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/google"},
        glue = {"stepdefinations/google"},
        plugin = {"pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "html:test-output",
                "json:json_output/cucumber.json",
                "junit:junit_xml_output/cucumber.xml"},
        dryRun = false,
        monochrome = true,
        tags = "@googleaboutPage"
)
public class TestRunner extends AbstractTestNGCucumberTests {
    public TestRunner() {
    }
}
