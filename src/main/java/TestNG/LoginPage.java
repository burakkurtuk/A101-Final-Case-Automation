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
    By login = By.id("login");
    By username = By.id("txtUserName");
    By loginButton1 = By.id("btnLogin");
    By password = By.id("txtPassword");
    By loginButton2 = By.id("btnEmailSelect");
    By userInformation = By.className("sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR");


    public void login() throws InterruptedException {
        Actions actions = new Actions(driver);
        List<WebElement> myAcc = driver.findElements(myAccount);
        actions.moveToElement(myAcc.get(0)).perform();
        waitFor(500);
        click(login);
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
