package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/feature",
				glue="steps",
				monochrome=true,
				dryRun=false)
public class RunTest extends AbstractTestNGCucumberTests{

}
