package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", glue="steps" , publish = true, monochrome = true)


public class TestRunner {
    @AfterClass
    public static void cleanDriver(){

    }
}
