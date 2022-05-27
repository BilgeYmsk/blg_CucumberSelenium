package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {


    @Before
    public void setup(){

        System.out.println("----This Statement comes from BEFORE----");
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }

        Driver.closeDriver();
        System.out.println("----This Statement comes from After------");
    }

    @Before ("@db") //before ve after metodlari olusturup yanina yazilan etiketlerde
    //o etiketlere sahip test senaryolari öncesinde ve sonrasinda calisiyor!!
    public void setupDb(){

        System.out.println("*** - Connecting to Database - ***");
    }

    @After ("@db")
    public void closeDb(){

        System.out.println("*** - Disconnecting to Database - ***");

    }

}
