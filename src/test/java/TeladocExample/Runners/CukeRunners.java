package TeladocExample.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features",
            glue = "TeladocExample/StepDefinitions",
            dryRun = false,
//            monochrome = true,
            strict = true,
            tags = "@AddAndDeleteUser" ,
            plugin = {"html:target/default-cucumber-reports",
                        "json:target/cucumber.json",
            }
    )

    public class CukeRunners{

    }

