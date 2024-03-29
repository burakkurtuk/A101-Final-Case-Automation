package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.jupiter.api.Assertions;


import java.util.List;

public class LoginPage extends BaseFunctions {
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    By myAccount = By.cssSelector("div[id='myAccount']");
    By login = By.id("login");
    By usernameLocator = By.id("txtUserName");
    By loginButton1 = By.id("btnLogin");
    By passwordLocator = By.id("txtPassword");
    By loginButton2 = By.id("btnEmailSelect");
    By userInformation = By.className("sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR");


    /**
     * @throws InterruptedException
     * @method "login" verify if user logged-in, find login button, send texts to email and password inputs
     */
    public void login() throws InterruptedException {
        Actions actions = new Actions(driver);
        List<WebElement> myAcc = driver.findElements(myAccount);
        actions.moveToElement(myAcc.get(0)).perform();
        waitFor(500);
        click(login);
        waitFor(500);
        type(usernameLocator, "USERNAME");
        waitFor(500);
        click(loginButton1);
        waitFor(500);
        type(passwordLocator, "PASSWORD");
        waitFor(500);
        click(loginButton2);
        waitFor(5000);
        Assertions.assertEquals(getText(userInformation), "Burak Kurt");


    }
}
