package tests;

import Utility.BaseDriver;
import helpers.POM;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US_02_Login extends BaseDriver {

    POM pom;

    @Test
    public void Login(){

        pom = new POM();

        driver.get("https://demo.nopcommerce.com");

        pom.loginPage.click();
        pom.email.sendKeys("tester@tester.tester.com");
        pom.password.sendKeys("secret");
        pom.loginButton.click();
        Assert.assertTrue(pom.myAccountButton.isEnabled());

    }
}
