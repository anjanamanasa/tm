package io.cucumber.skeleton.glue;

import io.cucumber.java.en.Then;
import io.cucumber.skeleton.core.Context;
import io.cucumber.skeleton.core.Manager;
import io.cucumber.skeleton.pages.BasicAuthPage;
import org.junit.jupiter.api.Assertions;

public class BasicAuthSteps extends Context {

    public BasicAuthSteps(Manager manager) {
        super(manager);
    }

    BasicAuthPage basicAuthPage = new BasicAuthPage(getDriver());

    @Then("valid credentials are supplied")
    public void supplyValidCredentials() {
        manager.getDriver().get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }

    @Then("Congratulations should be displayed")
    public void congratulationsShouldBeDisplayed() {
        Assertions.assertEquals("Congratulations! You must have the proper credentials.", basicAuthPage.getSuccessMessage());
    }

}
