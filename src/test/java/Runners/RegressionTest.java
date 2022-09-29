package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "stepDefinitions",
        tags = "@regression",
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "testng:target/cukes.xml",
                "rerun:target/rerun.txt"},
        dryRun = false)

public class RegressionTest{ }
