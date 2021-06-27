package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		//src/test/resources/AppFeatures/LoginPage.feature
		features = { "src\\main\\resources\\AppFeatures\\Vtigerloginvisibility.feature" }, 
		glue = { "StepDefinitions", "AppHooks" }, 
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				//"timeline:test-output-thread/"
				
		}
	)

public class MyTestRunnerforextendreport {

}
