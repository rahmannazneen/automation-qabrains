package tests;

import tests.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    protected WebDriver webDriver;
    protected FluentWait<WebDriver> fluentWait;

    @BeforeClass
    public void setUp() {
        // Initialize WebDriver based on the specified browser
        webDriver = getDriver();

        // Set default WebDriver timeouts
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        webDriver.manage().window().maximize();

        // Navigate to the base URL
        String url = ConfigReader.get("url");
        webDriver.get(url);
    }

    private WebDriver getDriver() {
        String browser = ConfigReader.get("browser");
        return switch (browser.toLowerCase()) {
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
                yield new ChromeDriver();
            }
            case "firefox" -> {
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
                yield new FirefoxDriver();
            }
            default -> throw new IllegalArgumentException("Unsupported browser: " + browser);
        };
    }

    @AfterClass
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
