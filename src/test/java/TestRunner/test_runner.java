package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "src/test/feature/devlab.feature" , glue = {"stepDefinition"} ,
        features = "src/test/feature/formsmarts.feature" , glue = {"stepDefinition"} ,
        tags = "@smoke",
        plugin = {
                "pretty",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-report/cucumber.html"}
)


public class test_runner {
}
