package stepsDefinitions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Features", glue = { "stepDefinitions" })
public class ResponseLoggingRunner extends LoggingStep{
	
}
