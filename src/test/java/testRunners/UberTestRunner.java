package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/java/features/Uber.feature",
		glue="stepDefinitions",
		//If we select all in the feature it will 
		tags="@All"
		//plugin="pretty"
		
		
		)
public class UberTestRunner {

}
