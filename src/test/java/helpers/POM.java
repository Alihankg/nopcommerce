package helpers;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
    public POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@class='ico-login']")
    public WebElement loginPage;

    @FindBy(xpath = "//input[@class='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@class='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='ico-logout']")
    public WebElement logoutButton;

    @FindBy(xpath = "//a[@class='ico-account']")
    public WebElement myAccountButton;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    public WebElement loginErrorMessage;

    public WebElement getLoginPage() {
        return loginPage;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public WebElement getLoginErrorMessage() {
        return loginErrorMessage;
    }
}
