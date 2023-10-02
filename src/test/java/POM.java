import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class POM {
    public POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@class='ico-register']")
    public WebElement registrButton;
    @FindBy(id = "gender-female")
    public WebElement gender;
    @FindBy(id = "FirstName")
    public WebElement firsName;
    @FindBy(xpath = "//input[@id='LastName']")
    public WebElement lastName;
    @FindBy(name = "DateOfBirthDay")
    public WebElement day;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement month;
    @FindBy(name = "//select[@name='DateOfBirthYear']")
    public WebElement year;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(id = "ConfirmPassword")
    public WebElement confirmpassword;
    @FindBy(xpath = "//button[@id='register-button']")
    public WebElement kaydolButton;
    @FindBy(xpath = "//div[@class='result']")
    public WebElement completed;
    @FindBy(xpath = "//form[@id='small-search-box-form']/input")
    public WebElement searchBox;

    @FindBy(xpath = "//button[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//h2[@class='product-title']/a")
    public List<WebElement> searchList;






}


