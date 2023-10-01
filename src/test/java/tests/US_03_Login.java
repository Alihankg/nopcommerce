package tests;

import Utility.BaseDriver;
import helpers.POM;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class US_03_Login extends BaseDriver {

    POM pom;

    @Test(dataProvider = "loginTestData")
    public void Login(String email, String password){

        pom = new POM();

        driver.get("https://demo.nopcommerce.com");

        pom.loginPage.click();
        pom.email.sendKeys(email);
        pom.password.sendKeys(password);
        pom.loginButton.click();

        if (email.equals("tester@tester.tester.com") && password.equals("secret")) {
            Assert.assertTrue(pom.myAccountButton.isEnabled());
            pom.logoutButton.click();
        } else {
            Assert.assertTrue(pom.loginErrorMessage.getText().contains("Login was unsuccessful. Please correct the errors and try again."));
        }
    }

    @DataProvider(name = "loginTestData")
    public Object[][] loginData(){
        return new Object[][]{{"tester@tester.tester.com", "secret"},
                {"testng2@gmail.com", "123qweasd"},
                {"testng1@gmail.com", "qweasdzxc"},
                {"testng2@gmail.com", "qweasdzxc"}};
    }
}
