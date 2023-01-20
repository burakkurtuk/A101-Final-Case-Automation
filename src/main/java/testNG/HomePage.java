package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class HomePage extends BaseFunctions {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By searchFieldLocator = By.cssSelector("input[type='text']");
    By searchButtonLocator = By.cssSelector("div[class='searchBoxOld-yDJzsIfi_S5gVgoapx6f']");
    By cookieLocator = By.cssSelector("button[id='onetrust-accept-btn-handler']");

    /**
     * @method "searchProduct" searching for the product
     */
    public void searchProduct() {
        click(cookieLocator);
        type(searchFieldLocator,"Rtx 4070 ti" );
        click(searchButtonLocator);

    }
}

