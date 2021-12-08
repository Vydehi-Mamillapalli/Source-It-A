package org.example.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.config.Loggers;
import org.example.hooksetup.HookSetup;
import org.example.pages.appages.APHomePage;
import org.example.utils.ExcelUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class TestStepDef{
    WebDriver driver = HookSetup.getDriver();
    APHomePage aphomepage = new APHomePage(driver);
    private static final Logger log = LogManager.getLogger(TestStepDef.class);


    @Given("user is  on homepage")
    public void user_is_on_homepage() {
        log.info("Navigating to URL");
        aphomepage.navigateURL("https://testwise.testingforschools.com/tests/player-demo-iseb/#/");
    }

    @When("user performs actions")

    aphomepage.click English();
    aphomepage.click Starttest();
    aphomepage.click Next();
    aphomepage.click onethird();
    aphomepage.click Next1();
    aphomepage.click Option4();
    aphomepage.click Next2();
    aphomepage.click Next3();
    aphomepage.click Option2();
    aphomepage.click Next4();
    aphomepage.click OptionAre();
    aphomepage.click Next5();
    aphomepage.click Next6();
    aphomepage.click Spelling1();
    aphomepage.click Next7();
    aphomepage.click Spelling2();
    aphomepage.click Next8();
    aphomepage.click Spelling3();
    aphomepage.click Next9();
    aphomepage.click Endtest();
}

    @Then("Waits and Close the browser")
    public void success_message_is_displayed() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
