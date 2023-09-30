package tests;

import Utility.BaseDriver;
import helpers.POM;
import org.testng.annotations.Test;

public class US_02_Login extends BaseDriver {

    POM pom;

    @Test
    public void Login(){

        pom = new POM();

        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

        pom.loginPage.click();
        pom.getEmail().sendKeys("testng1@gmail.com");
        pom.getPassword().sendKeys("123qweasd");
        pom.getLoginButton().click();

    }
}
