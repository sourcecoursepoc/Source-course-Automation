package cucumberTest;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		
        features = "resources/sample2.feature",
        glue="stepDefinitions", monochrome = true,plugin = {"html:target/cucumber.html"})

public class TestRunner {
	
	

}


 