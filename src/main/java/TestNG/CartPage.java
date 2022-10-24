package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class CartPage extends BaseFunctions {

    public CartPage(WebDriver driver) {
        super(driver);
    }


    By shoppingCart = By.cssSelector("span[id='shoppingCart']");

    By firstSeller = By.xpath("(//span[@class='merchantLink_2Ii8s'])[1]");

    By secondSeller = By.xpath("(//span[@class='merchantLink_2Ii8s'])[2]");

    public void goToCart() throws InterruptedException {
        click(shoppingCart);
        waitFor(2000);
        Assertion(driver.findElement(firstSeller),"Gokkusagibilgisayar" );
        Assertion(driver.findElement(secondSeller), "Hepsiburada");

    }
}
