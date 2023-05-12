package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/swagLabsFeatures/LoginFeature.feature"},
		glue= {"stepDefinitions","ApplicationHooks"},
		plugin= {"pretty"}
		
		)
public class LoginTestRunner {

}
