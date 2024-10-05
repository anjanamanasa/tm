package io.cucumber.skeleton.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends Page {

  public HomePage(ChromeDriver driver) {
    super(driver);
    System.out.println("Homepage title is : " + getTitle().getText());
  }

  @FindBy(css = "h1")
  private WebElement title;

  @FindBy(xpath = "//div[@id='content']//ul//li")
  List<WebElement> homePageList;

  @FindBy(xpath = "//div[@id='content']//ul//li//a[contains(text(), 'Basic Auth')]")
  WebElement basicAuth;

  @FindBy(xpath = "//div[@id='content']//ul//li //a[contains(text(),'Sortable Data Tables')]")
  WebElement sortableData;

  public WebElement getTitle() {
    return title;
  }

  public void refresh() {
    driver.navigate().refresh();
    System.out.println("Refreshed page");
  }

  public List<String> getListElements() {
    return homePageList.stream().map(WebElement :: getText).collect(Collectors.toList());
  }

  public void basicAuthClick() {
    basicAuth.click();
  }

  public void clickSortableData() {
    sortableData.click();
  }
}
