package runner_cukes;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:Features/",
        glue={ "helper_classes", "Step_Definitions", "runner_cukes"},  // These two must be glued
        
        
        tags = {"@Runme"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-html_report", "junit:target/cucumber-junit-results.xml"}
        )
public class TestRunner extends AbstractTestNGCucumberTests {
}
//  "@GoogleFooterLinkTest"

