package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class HomePage extends BaseFunctions {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By searchFieldLocator = By.className("desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b");
    By searchButtonLocator = By.cssSelector("div[class='SearchBoxOld-cHxjyU99nxdIaAbGyX7F']");
    By cookieLocator = By.cssSelector("button[id='onetrust-accept-btn-handler']");

    /**
     * @method "searchProduct" searching for the product
     */
    public void searchProduct() {
        Scanner sc = new Scanner(System.in);
        click(cookieLocator);
        type(searchFieldLocator,"Rtx 3090" );
        click(searchButtonLocator);

    }
}

