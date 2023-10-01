import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class POM {
    public POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(linkText = "Log in")
    public WebElement login;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(css = "[class='button-1 login-button']")
    public WebElement loginButton;
    @FindBy(linkText = "Computers")
    public WebElement computers;
    @FindBy(linkText = "Notebooks")
    public WebElement notebooks;
    @FindBy(css = "[class='product-title'] a")
    public List<WebElement> tabProducts;
    @FindBy(id = "small-searchterms")
    public WebElement search;
    @FindBy(xpath = "//a[text()='Adobe Photoshop CS4']")
    private WebElement product;

    @FindBy(css = "[class='top-menu notmobile']>li")
    public List<WebElement>tabMenu;
    @FindBy(xpath = "//h2[@class='product-title']/a")
    private List<WebElement> productTitle;

    public List<WebElement> getProductTitle() {
        return productTitle;
    }

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

    public WebElement getProduct() {
        return product;
    }

    public static int RandomAtama(int Miktar) {
        return (int) (Math.random() * Miktar);
    }








}
