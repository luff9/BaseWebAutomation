package page;

import lib.DriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    public static final String LOG_IN_URL = "";
    WebDriver driver;
    @FindBy(xpath = "//div[@data-fragment-name='AccountNavigation']//div[contains(@class,'account-user')]")
    WebElement buttonNavigateToLogIn;
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement buttonAcceptCookies;

    public HomePage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void gotoLoginPage() {
        buttonNavigateToLogIn.click();
    }

    public void acceptCookies() {
        buttonAcceptCookies.click();
        DriverLib.sleep(2000);
    }


}
