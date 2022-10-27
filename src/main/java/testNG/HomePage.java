package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseFunctions {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By searchFieldLocator = By.cssSelector("input[class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b']");
    By searchButtonLocator = By.cssSelector("div[class='SearchBoxOld-cHxjyU99nxdIaAbGyX7F']");


    public void searchProduct() {
        type(searchFieldLocator, "Rtx 3090");
        click(searchButtonLocator);
    }


}

