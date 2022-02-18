package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features="src/test/resources/features" ,
              glue= "StepDefinitions",
        publish = true,
        plugin = {"html:target/cucumber.html" ,
                "rerun:target/rerun.txt" ,// store the failed scenario into rerun.txt

        },

        dryRun = false
  //       ,tags="@ft2"

)
public class TestRunner {
}
