import TestNG.CartPage;
import TestNG.HomePage;
import TestNG.LoginPage;
import TestNG.ProductDetails;
import org.testng.annotations.Test;

public class TestWithRegistration extends BaseTest{

    LoginPage loginPage;
    HomePage homePage;
    ProductDetails productDetails;
    CartPage cartPage;


    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.login();

    }

    @Test(priority = 2)
    public void searchProductTest() {
        homePage = new HomePage(driver);
        homePage.searchProduct();

    }

    @Test(priority = 3)
    public void chosenProduct() throws InterruptedException {
        productDetails = new ProductDetails(driver);
        productDetails.chooseProduct();
    }

    @Test(priority = 4)
    public void cartPage() throws InterruptedException {
        cartPage = new CartPage(driver);
        cartPage.goToCart();

    }



















}
