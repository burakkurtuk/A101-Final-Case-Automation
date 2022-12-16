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


    By shoppingCart = By.cssSelector("span[id='shoppingCart']");
    By firstSeller = By.xpath("(//span[@class='merchantLink_2Ii8s'])[1]");
    By secondSeller = By.xpath("(//span[@class='merchantLink_2Ii8s'])[2]");
    By productInf = By.className("product_name_3Lh3t");


    /**
     * @throws InterruptedException
     * @method "goToCart" directs to cartPage and verifies that product is correct and sellers are different
     */
    public void goToCart() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shopCart = driver.findElement(shoppingCart);
        js.executeScript("arguments[0].scrollIntoView();", shopCart);
        waitFor(1000);
        click(shoppingCart);
        waitFor(2000);
        Assertions.assertEquals(getText(firstSeller), "Hepsiburada");
        Assertions.assertEquals(getText(secondSeller), "Bytekbilgisayar");
        Assertions.assertEquals(getText(productInf), "MSI VGA GeForce RTX 3090 Ti Black Trio 24G RTX3090 24GB GDDR6X 384B DX12 Pcıe 4.0 X16 (3xDP 1xHDMI) Ekran Kartı");

    }
}
