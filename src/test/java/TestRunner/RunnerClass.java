package TestRunner;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureFile",tags = "@Timesheet and @Update", glue ={"StepDeffinations"},monochrome = true)
public class RunnerClass {
	 
	 
			
	
		
	

	}


