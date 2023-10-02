import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static Utility.MyFunc.Bekle;
import static Utility.MyFunc.isClickable;

public class US_02_Login extends BaseDriver {

    @Test
    public void Login(){

        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

        WebElement loginClick = isClickable(By.xpath("//a[@class='ico-login']"));
        loginClick.click();

        WebElement email = isClickable(By.xpath("//input[@class='email']"));
        email.sendKeys("testng1@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@class='password']"));
        password.sendKeys("123qweasd");

        WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginButton.click();

    }
}
