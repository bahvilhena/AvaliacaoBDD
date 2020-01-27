package runners;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/funcionalTests/End2End_Test.feature",
 glue= {"stepDefinitions"}
 
 )

public class TestRunner {
	
	

}

