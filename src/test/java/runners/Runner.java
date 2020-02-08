package runners;

import com.vimalselvam.cucumber.listener.Reporter;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"bindings"},
        plugin = {"pretty", "json:target/report.html"},
        monochrome = true
)

public class Runner {
    @AfterClass
    public static void setup()
    {
        Reporter.loadXMLConfig(new File("src/test/config/extent-config.xml"));
        Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
        Reporter.setSystemInfo("User Name", "Antonio");
        Reporter.setSystemInfo("Application Name", "Automation practice app");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name"));
        Reporter.setSystemInfo("Environment", "Production");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }
}