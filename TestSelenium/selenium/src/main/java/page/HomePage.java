package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.DateUtils;
public class HomePage extends BasePage {

    String todayDate = DateUtils.getTodayDate();

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Accept All Cookies']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//input[@name='flight_origin']" )
    private WebElement inputFlightOrigin;

    @FindBy(xpath = "//input[@name='flight_destiny']")
    private WebElement inputFlightDestiny;

    @FindBy(xpath = "//span[text()='Round trip']")
    private WebElement selectTrip;

    @FindBy(xpath = "//span[text()='One way']")
    private WebElement optionOneWay;

    @FindBy(xpath = "//label[text()='Departure date']")
    private WebElement selectDeparterDate;

    @FindBy(xpath = "//div[@data-function='cal-start']")
    private WebElement calendar;

    @FindBy(xpath = "//button[@id='buttonSubmit1']")
    private WebElement buttonSearch;

    @FindBy(xpath = "//button[text()='Continue with my selection']")
    private WebElement confirmSelection;
    

    public void acceptCookies() {
        waitForVisibility(acceptCookies);
        click(acceptCookies);
    }
    public void inputFlightOrigin(String query) {
        enterText(inputFlightOrigin,query);
    }

    public void inputFlightDestiny(String query){
        enterText(inputFlightDestiny, query);
    }

    public void selectTrip(){
        click(selectTrip);
        click(optionOneWay);
    }
    public void chooseDateOnCalender(){
        click(selectDeparterDate);
        waitForVisibility(calendar);
        WebElement todayElement = calendar.findElement(By.xpath("//a[text()='" + todayDate + "']"));
        click(todayElement);
    }

    public void searchResouces(){
        click(buttonSearch);
    }

    public void confirmSelection(){
        click(confirmSelection);
    }


        
}
