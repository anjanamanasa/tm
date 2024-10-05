package io.cucumber.skeleton.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SortableDataTablePage extends Page{
    public SortableDataTablePage(ChromeDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//table[@id='table1']//tbody//tr")
    private List<WebElement> tableRows;

    public List<WebElement> getTableRows() {
        return tableRows;
    }

}
