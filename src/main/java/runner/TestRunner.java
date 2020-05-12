package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features= {"/media/gaurav/BA92AE4892AE0949/ReloadOne/CRMProBDD/src/main/java/feature/Contact.feature"}
					,glue= {"stepDefinition"}
					,format= {"pretty"}
					,dryRun= false
					,monochrome= true
					,strict= true
					)

public class TestRunner {

}
