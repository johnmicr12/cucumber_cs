package testBatchRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="stepDef",tags= {"@Register"},plugin= {"pretty","json:target/cucum2073-json-report.json"})
public class TestRunner {

}
