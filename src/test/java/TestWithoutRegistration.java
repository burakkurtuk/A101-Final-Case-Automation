import TestNG.CartPage;
import TestNG.HomePage;
import TestNG.ProductDetails;

import org.testng.annotations.Test;

public class TestWithoutRegistration extends BaseTest {

    HomePage homePage;
    ProductDetails productDetails;

    CartPage cartPage;

    @Test(priority = 1)
    public void searchProductTest() {
        homePage = new HomePage(driver);
        homePage.searchProduct();

    }

    @Test(priority = 2)
    public void chosenProduct() throws InterruptedException {
        productDetails = new ProductDetails(driver);
        productDetails.chooseProduct();
    }



    @Test(priority = 3)
    public void cartPage() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.goToCart();

    }
}
