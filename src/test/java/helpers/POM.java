package helpers;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    @FindBy(xpath = "//a[text()='Adobe Photoshop CS4']")
    public WebElement product;

    @FindBy(xpath = "//h2[@class='product-title']/a")
    public List<WebElement> productTitle;

    @FindBy(linkText = "Computers")
    public WebElement computers;

    @FindBy(id = "small-searchterms")
    public WebElement search;

    @FindBy(linkText = "Electronics")
    public WebElement electronics;

    @FindBy(xpath = "//*[text()='Apparel ']")
    public WebElement apparel;

    @FindBy(linkText = "Gift Cards")
    public WebElement GiftCarts;

    @FindBy(xpath = "(//div[@class='picture'])[1]")
    public WebElement picture;

    @FindBy(css = "[id='giftcard_43_RecipientName']")
    public WebElement Name;

    @FindBy(css = "[id='giftcard_43_RecipientEmail']")
    public WebElement Email;

    @FindBy(css = "[id='giftcard_43_SenderName']")
    public WebElement YourName;

    @FindBy(css = "[id='giftcard_43_SenderEmail']")
    public WebElement YourEmail;

    @FindBy(css = "[id='giftcard_43_Message']")
    public WebElement Message;

    @FindBy(css = "[id='add-to-cart-button-43']")
    public WebElement AdToCard;

    public static int RandomAtama(int Miktar) {
        return (int) (Math.random() * Miktar);
    }

}
