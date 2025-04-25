

package base;

import config.ConfigManager;
import config.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected static final Logger logger = LogManager.getLogger(BaseTest.class);

    public BaseTest() {
    }

    @BeforeMethod
    public void setup() {
        this.driver = DriverFactory.getDriver();
        this.driver.get(ConfigManager.getProperty("baseUrl"));
        logger.info("Started test with URL {}", ConfigManager.getProperty("baseUrl"));
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
        logger.info("Driver instance is quit after the test");
    }
}
