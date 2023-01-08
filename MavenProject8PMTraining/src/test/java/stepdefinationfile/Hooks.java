package stepdefinationfile;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resuable.BrowserInvocation;

public class Hooks extends BrowserInvocation {

    @Before
    public void preCondition(){
        System.out.println("Execution stated");
    }

    @AfterStep
    public void captureScreenshot(Scenario sc){

     byte[] screenshot =   ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
     sc.attach(screenshot,"image/png",null);

    }

    @After
    public void postCondition(){
        System.out.println("Execution Ended");
        driver.close();
    }

    @BeforeStep
    public void capture(){

    }


}
