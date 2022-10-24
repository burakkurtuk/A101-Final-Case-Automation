package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class LoginPage extends BaseFunctions {
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    By myAccount = By.cssSelector("div[id='myAccount']");
    By login = By.cssSelector("a#login");
    By loginBox = By.cssSelector("div[class='_1TxjTFlVZPBnn-I7vOVL2U _2kBZQPq-lRfZa5Zbc9SbZn ']");
    By username = By.cssSelector("input[id='txtUserName']");
    By loginButton1 = By.cssSelector("button[id='btnLogin']");
    By password = By.cssSelector("input[id='txtPassword']");
    By loginButton2 = By.cssSelector("button[id='btnEmailSelect']");
    By userInformation = By.cssSelector("span[class='sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR']");


    public void login() throws InterruptedException {
        Actions actions = new Actions(driver);
        List<WebElement> myAcc = driver.findElements(myAccount);
        actions.moveToElement(myAcc.get(0)).perform();
        waitFor(500);
        click(login);
        waitFor(500);
        click(loginBox);
        waitFor(500);
        type(username, "testingbykurt@gmail.com");
        waitFor(500);
        click(loginButton1);
        waitFor(500);
        type(password, "1122334455Bk");
        waitFor(500);
        click(loginButton2);
        waitFor(2000);
        Assertion(driver.findElement(userInformation), "Burak Kurt");

    }


}
