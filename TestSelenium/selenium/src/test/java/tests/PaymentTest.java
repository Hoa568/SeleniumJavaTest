package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.baseTest;
import page.HomePage;
import utils.DriverFactory;

public class PaymentTest extends baseTest {
    // Negative Test Case: Testing the flight search functionality with invalid data
    @Test
    public void testPayment() {
        WebDriver driver = DriverFactory.createDriver("chrome");

        // Step 1: Navigate to the Iberia website
        driver.get("https://www.iberia.com/");
        driver.manage().window().maximize();

        // Step 2: Create an instance of the HomePage class
        HomePage homePage = new HomePage(driver);

        // Step 3: Accept cookies (if applicable)
        homePage.acceptCookies();

        // Step 4: Input the flight origin
        homePage.inputFlightOrigin("VALENCIA");
        Assert.assertEquals(driver, homePage);

        // Step 5: Input the flight destination
        homePage.inputFlightDestiny("BARCELONA");

        // Step 6: Select the trip type
        homePage.selectTrip();

        // Step 7: Choose today's date from the calendar
        homePage.chooseDateOnCalender();

        // Step 8: Search for available resources (flights)
        homePage.searchResouces();

        // Step 9: Close the browser
        //driver.quit();
    }
}
