package TestRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
    //@RunWith(Cucumber.class)
	//	@CucumberOptions( 
	//	features= {".//FeatureFiles/Login.feature"}, 
	//	glue="stepDefinitions")

		features={".//FeatureFile/LoginSuccessfull.feature"},
		glue = "StepDefinations"
		)

public class TestRun {

}
