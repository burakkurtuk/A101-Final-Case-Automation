import Log.Log;
import TestNG.CartPage;
import TestNG.HomePage;
import TestNG.ProductDetails;

import org.testng.annotations.Test;

public class TestWithoutRegistration extends BaseTest {

    HomePage homePage;
    ProductDetails productDetails;

    CartPage cartPage;

    Log log;

    @Test(priority = 1)
    public void searchProductTest() {
        homePage = new HomePage(driver);
        homePage.searchProduct();
        log = new Log();
        log.info("Searched for the product");
    }

    @Test(priority = 2)
    public void chosenProduct() throws InterruptedException {
        productDetails = new ProductDetails(driver);
        productDetails.chooseProduct();
        log.info("The product is chosen and added to cart ");
    }



    @Test(priority = 3)
    public void cartPage() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.goToCart();
        log.info("Navigated to cart and verified that sellers are different");
    }
}
