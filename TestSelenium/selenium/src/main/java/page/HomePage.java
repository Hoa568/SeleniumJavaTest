package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(cssSelector("div.orangehrm-login-form > form > div:nth-child(2) > div > div:nth-child(2) > input"));
    private WebElement Username;

    @FindBy(cssSelector("div.orangehrm-login-form > form > div:nth-child(3) > div > div:nth-child(2) > input" ));
    private WebElement Password;

    @FindBy(cssSelector("div.oxd-form-actions.orangehrm-login-action > button"))
    private WebElement buttonLogin;

    @FindBy(cssSelector("header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > span > i"))
    private WebElement LogOutFrame;

    @FindBy(cssSelector("header > div.oxd-topbar-header > div.oxd-topbar-header-userarea > ul > li > ul > li:nth-child(4) > a"))
    private WebElement LogOutButton;
    


        
}
