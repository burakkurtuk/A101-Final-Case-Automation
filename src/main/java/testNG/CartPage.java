package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CartPage extends BaseFunctions {

    public CartPage(WebDriver driver) {
        super(driver);
    }


    By shoppingCart = By.cssSelector("span[id='shoppingCart']");

    By firstSeller = By.xpath("(//span[@class='merchantLink_2Ii8s'])[1]");

    By secondSeller = By.xpath("(//span[@class='merchantLink_2Ii8s'])[2]");

    /**
     * @method "goToCart" directs to cartPage and verifies that sellers are different
     * @throws InterruptedException
     */
    public void goToCart() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shopCart = driver.findElement(shoppingCart);
        js.executeScript("arguments[0].scrollIntoView();",shopCart);
        waitFor(1000);
        click(shoppingCart);
        waitFor(2000);
        Assertion(driver.findElement(firstSeller),"Gokkusagibilgisayar" );
        Assertion(driver.findElement(secondSeller), "Hepsiburada");

    }
}
