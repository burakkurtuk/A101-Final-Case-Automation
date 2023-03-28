package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class ProductDetails extends BaseFunctions {

    public ProductDetails(WebDriver driver) {
        super(driver);
    }

    By product = By.partialLinkText("Watch Se Gps 44MM");
    By allSellers = By.className("optionsLength");
    By repairPack = By.cssSelector("a[class='deny-text']");
    By addToCart = By.xpath("(//button[@class='add-to-basket button'])[1]");
    By addToCart2 = By.xpath("(//button[@class='add-to-basket button'])[2]");

    /**
     * @throws InterruptedException
     * @method "chooseProduct" the product is chosen and added to cart
     */
    public void chooseProduct() throws InterruptedException {
        waitFor(1000);
        click(product);
        List<String> pages = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(pages.get(1));
        waitFor(1000);
        click(allSellers);
        waitFor(1000);
        click(addToCart);
        waitFor(1500);
        click(repairPack);
        waitFor(1000);
        click(addToCart2);
        waitFor(1500);

    }
}