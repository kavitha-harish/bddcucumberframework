package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		//src/test/resources/AppFeatures/LoginPage.feature
		features = { "src\\main\\resources\\AppFeatures\\Vtigernegativetest.feature" }, 
		glue = { "StepDefinitions", "AppHooks" }, 
		monochrome = true,
		dryRun = true,
		plugin = {"pretty",
				"html:target/HTMLReporthtml/htmlreport.html",
				
				
		}
	)

public class runner {
	

}
