package tests;


import log.Log;
import org.testng.annotations.*;
import testNG.CartPage;
import testNG.HomePage;
import testNG.ProductDetails;

public class WithoutRegistrationTest extends BaseTest {


    HomePage homePage;
    ProductDetails productDetails;
    CartPage cartPage;
    Log log;


    @Test
    public void addProductToCartWithoutRegister() throws InterruptedException {
        homePage = new HomePage(driver);
        productDetails = new ProductDetails(driver);
        cartPage = new CartPage(driver);
        log = new Log();
        homePage.searchProduct();
        log.info("Searched for the product");
        productDetails.chooseProduct();
        log.info("The product is chosen and added to cart ");
        cartPage.goToCart();
        log.info("Navigated to cart and verified that product is correct and sellers are different");

    }
}
