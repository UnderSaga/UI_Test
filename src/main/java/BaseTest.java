import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.Steps;

public class BaseTest implements Steps {

    public WebDriver driver;
    @BeforeMethod
    public void setUp() {
        String currentBrowser = System.getProperty("selenide.browser", "chrome");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
