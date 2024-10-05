package io.cucumber.skeleton.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BasicAuthPage extends Page{


    public BasicAuthPage(ChromeDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id ='content']//div[@class='example']//p")
    WebElement successMessage;

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}
