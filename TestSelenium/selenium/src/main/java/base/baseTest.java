package base;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import utils.DriverFactory;
import org.junit.After;
import org.junit.Before;

public class baseTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverFactory.createDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
