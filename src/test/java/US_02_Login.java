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

        WebElement loginClik = isClickable(By.xpath("//a[@class='ico-login']"));
        loginClik.click();

        WebElement email = isClickable(By.xpath("//input[@class='email']"));
        email.click();
        email.sendKeys("");

        WebElement password = isClickable(By.xpath("//input[@class='password']"));
        password.click();
        password.sendKeys("");

        WebElement logBttn = isClickable(By.xpath("//button[@class='button-1 login-button']"));
        logBttn.click();

        Bekle(5);
        driver.quit();







    }
}
