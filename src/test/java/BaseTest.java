import Log.Log;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {


    WebDriver driver;
    Log log;

    @BeforeTest
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-blink-features");
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.addArguments("--disable-extensions");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://www.hepsiburada.com/");
        log = new Log();
        log.info("Navigated to site");
    }

    @AfterTest
    public void quit(){driver.quit();}

}
