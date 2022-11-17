package testRunners;

import org.junit.runner.RunWith;  

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/java/features/BillingAmount.feature",
		glue={"stepDefinitions"},
		//tags="@Smoke",
		
		//pretty plugin is used to generate the report in the given file and also it will generate the output in the proper way.
		plugin= {"pretty",
		"json:target/MyReports/report.json",
		"junit:target/MyReports/report.xml"},
		
		//MonoChrome will help to generate the output in the proper format and alignment.
		monochrome=true,
		
		
		//dryRun is used to check is there any stepDefinition is missing to implement for any step in the feature file.
		dryRun=true
		
		)
public class AmazingTestRunners {
	
	
	

}
