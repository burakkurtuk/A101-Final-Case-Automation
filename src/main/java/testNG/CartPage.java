package testNG;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CartPage extends BaseFunctions {

    public CartPage(WebDriver driver) {
        super(driver);
    }


    By closeWindow = By.cssSelector(".checkoutui-Modal-iHhyy79iR28NvF33vKJb");
    By shoppingCart = By.cssSelector("span[id='shoppingCart']");
    By firstSeller = By.xpath("(//span[@class='merchant_link_6GAiM'])[1]");
    By secondSeller = By.xpath("(//span[@class='merchant_link_6GAiM'])[2]");
    By productInf = By.className("product_name_2Klj3");


    /**
     * @throws InterruptedException
     * @method "goToCart" directs to cartPage and verifies that product is correct and sellers are different
     */
    public void goToCart() throws InterruptedException {
        waitFor(1000);
        click(closeWindow);
        waitFor(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shopCart = driver.findElement(shoppingCart);
        js.executeScript("arguments[0].scrollIntoView();", shopCart);
        waitFor(1000);
        click(shoppingCart);
        waitFor(2000);
        Assertions.assertEquals(getText(firstSeller), "Teknoplustoptan");
        Assertions.assertEquals(getText(secondSeller), "Mk Ses Teknoloji");
        Assertions.assertEquals(getText(productInf), "Apple Watch Se Gps 44MM Silver Aluminium Case With White Sport Band - Regular MNK23TU/A");

    }
}
