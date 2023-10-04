package AC_01_04;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AC_01_Reg_ extends BaseDriver {

    //AC_01_Reg_
    @Test(groups = {"Smoke Test"}, priority = 1)
    public void test1() {
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        WebElement register = driver.findElement(By.cssSelector("[class='ico-register']"));
        register.click();

        WebElement male = driver.findElement(By.id("gender-male"));
        male.click();

        WebElement FirstName = driver.findElement(By.id("FirstName"));
        FirstName.sendKeys("Ahmet");

        WebElement LastName = driver.findElement(By.id("LastName"));
        LastName.sendKeys("Kurt");

        WebElement DateOfBirthDay = driver.findElement(By.name("DateOfBirthDay"));
        DateOfBirthDay.sendKeys("4");

        WebElement DateOfBirthMonth = driver.findElement(By.name("DateOfBirthMonth"));
        DateOfBirthMonth.sendKeys("June");

        WebElement DateOfBirthYear = driver.findElement(By.name("DateOfBirthYear"));
        DateOfBirthYear.sendKeys("2004");

        WebElement Email = driver.findElement(By.id("Email"));
        Email.sendKeys("testng1@gmail.com");

        WebElement Password = driver.findElement(By.id("Password"));
        Password.sendKeys("123qweasd");

        WebElement ConfirmPassword = driver.findElement(By.id("ConfirmPassword"));
        ConfirmPassword.sendKeys("123qweasd");

        WebElement button = driver.findElement(By.id("register-button"));
        button.click();

        WebElement button1 = driver.findElement(By.cssSelector("[class='button-1 register-continue-button']"));
        button1.click();


    }

}






