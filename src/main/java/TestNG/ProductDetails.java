package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class ProductDetails extends BaseFunctions {

    public ProductDetails(WebDriver driver) {
        super(driver);
    }

    By product = By.partialLinkText("MSI Nvidia GeForce RTX 3090 Surprim X 24GB OC");
    By addToCart = By.cssSelector("button[id='addToCart']");
    By addToCart2 = By.xpath("(//button[@class='add-to-basket button small'])[1]");

    public void chooseProduct() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement prod = driver.findElement(product);
        js.executeScript("arguments[0].scrollIntoView();", prod);
        waitFor(500);
        click(product);
        List<String> pages = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(pages.get(1));
        click(addToCart);
        waitFor(1000);
        click(addToCart2);
        waitFor(500);


    }
}