package io.cucumber.skeleton.glue;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.skeleton.core.Context;
import io.cucumber.skeleton.core.Manager;
import io.cucumber.skeleton.pages.HomePage;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Home extends Context {

  HomePage homePage = new HomePage(getDriver());

  public Home(Manager manager) {
    super(manager);
  }

  @Given("an example Home Page step")
  public void exampleHomePageStep() {
    System.out.println("printing shared stash :" + getTestStash().toString());
  }

  @And("show the list of expected links")
  public void verifyTheExpectedList() {
    List<String> homePageElements = homePage.getListElements();
    Assertions.assertEquals(44, homePageElements.size());
  }

  @Then("the list should contain expected items")
  public void theListShouldContainExpectedItems() {
    List<String> itemList = getItemList();
    Assertions.assertTrue(itemList.containsAll(homePage.getListElements()));

  }



  private List<String> getItemList() {
    List<String> itemList = new ArrayList<>();
    try {
      itemList = Files.readAllLines(Paths.get("src/test/resources/data/baseList.txt"));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return itemList;
  }

  @When("the 'Basic Auth' example is opened")
  public void basicAuthIsOpened() {
    homePage.basicAuthClick();
  }
}