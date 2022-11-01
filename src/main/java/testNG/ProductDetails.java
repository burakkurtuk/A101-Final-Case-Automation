package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;


public class ProductDetails extends BaseFunctions {

    public ProductDetails(WebDriver driver) {
        super(driver);
    }

    By product = By.partialLinkText("MSI Nvidia GeForce RTX 3090 Surprim X 24GB OC");
    By allSellers = By.className("optionsLength");
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
        click(addToCart2);
        waitFor(1000);

    }
}