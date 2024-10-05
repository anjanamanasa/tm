package io.cucumber.skeleton.glue;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.skeleton.core.Context;
import io.cucumber.skeleton.core.Manager;
import io.cucumber.skeleton.pages.SortableDataTablePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SortableDataTableSteps extends Context {
    public SortableDataTableSteps(Manager manager) {
        super(manager);
    }

    SortableDataTablePage sortableDataTablePage = new SortableDataTablePage(getDriver());

    @Then("Data table should be displayed the following")
    public void dataTableShouldBeDisplayed(DataTable dataTable) {
        List<List<String>> dataTableData = dataTable.asLists();
        List<WebElement> tableRows = sortableDataTablePage.getTableRows();
        int rowCount =1;
        for (WebElement row: tableRows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            Assertions.assertEquals(columns.get(0).getText(), dataTableData.get(rowCount).get(0));
            Assertions.assertEquals(columns.get(1).getText(), dataTableData.get(rowCount).get(1));
            Assertions.assertEquals(columns.get(2).getText(), dataTableData.get(rowCount).get(2));
            Assertions.assertEquals(columns.get(3).getText(), dataTableData.get(rowCount).get(3));
            Assertions.assertEquals(columns.get(4).getText(), dataTableData.get(rowCount).get(4));
            rowCount++;
        }

    }

}
