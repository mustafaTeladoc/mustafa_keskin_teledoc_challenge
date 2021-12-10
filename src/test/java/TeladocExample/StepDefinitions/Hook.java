package TeladocExample.StepDefinitions;

import TeladocExample.Utilities.ConfigurationReader;
import TeladocExample.Utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    static String env;

    public static String getEnv() {
        return env;
    }

    public static void setEnv(String env) {
        Hook.env = env;
    }


    @Before
    public void setup() {
        System.out.println("##############################");
        System.out.println("Teladoc Demo Started");
        Driver.get().manage().window().maximize();
        Driver.get().get(ConfigurationReader.getProperty("example-url"));
    }

    @After
    public void teardown(Scenario scenario) {
        //if test failed - do this
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png", "Screenshot");
            System.out.println("Test failed!");

        } else {
            System.out.println("Cleanup!");
            System.out.println("Test completed!");
        }
        System.out.println("##############################");
        //after every test, we gonna close browser
        Driver.close();
    }
}