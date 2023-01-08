package runnerfile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/featurefile"},
        glue = {"stepdefinationfile"},
        tags = "@SC1",
        monochrome = true,
        plugin = {"pretty","html:test-output/report.html",
                "json:test-output/jsonReport.json",
                "junit:test-output/junitReport.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
               }


)


public class FeatureRunner {
}
