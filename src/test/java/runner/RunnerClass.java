package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target\\login.html",
		"json:target\\login.json"},
		features="featureFiles\\sample.feature",
				glue="stepDefinitions")
public class RunnerClass {

}
