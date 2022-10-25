import Log.Log;
import TestNG.CartPage;
import TestNG.HomePage;
import TestNG.ProductDetails;
import org.testng.annotations.Test;

public class WithoutRegistirationTest extends BaseTest {


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
        log.info("Navigated to cart and verified that sellers are different");


    }

//    @Test(priority = 2)
//    public void chosenProduct() throws InterruptedException {
//        productDetails = new ProductDetails(driver);
//        productDetails.chooseProduct();
//
//    }
//
//
//
//    @Test(priority = 3)
//    public void cartPage() throws InterruptedException {
//        cartPage = new CartPage(driver);
//        cartPage.goToCart();
//
//    }

}
