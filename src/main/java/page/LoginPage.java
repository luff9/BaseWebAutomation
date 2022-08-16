package page;

import lib.DriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage {
    @FindBy(xpath = "//div[@id='account-navigation-container']//div[@class='user-loggedin-container']//p[@class='user-name']")
    public List<WebElement> loggedInUser;
    @FindBy(id = "error-box-wrapper")
    public WebElement getLoggInErrorMessage;
    WebDriver driver;
    @FindBy(id = "login-email")
    WebElement textBoxEMail;
    @FindBy(id = "login-password-input")
    WebElement textBoxPassword;
    @FindBy(xpath = "div[@id='login-register']//button[@type='submit']")
    WebElement buttonLogin;

    public LoginPage(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void login(String eMail, String password) {
        textBoxEMail.sendKeys(eMail);
        textBoxPassword.sendKeys(password);
        buttonLogin.click();
        DriverLib.sleep(3000);
    }

    public String getLoggedInUserEMail() {
        return loggedInUser.get(0).getAttribute("innerText");
    }
}
