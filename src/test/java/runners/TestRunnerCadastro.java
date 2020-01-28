package runners;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.junit.Cucumber;
import pageObjects.DriverFactory;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\funcionalTests\\", glue = { "stepDefinitions" }, plugin = { "pretty",
		"html: report/relatorio.html" })

public class TestRunnerCadastro {

}
