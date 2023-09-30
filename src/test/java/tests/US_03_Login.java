package tests;

import Utility.BaseDriver;
import Utility.MyFunc;
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
        driver.manage().window().maximize();

        pom.getLoginPage().click();
        pom.getEmail().sendKeys(email);
        pom.getPassword().sendKeys(password);
        pom.getLoginButton().click();

        if (email.equals("testng1@gmail.com") && password.equals("123qweasd")) {
            Assert.assertTrue(pom.getMyAccountButton().isEnabled());
            pom.getLogoutButton().click();
        } else {
            Assert.assertTrue(pom.getLoginErrorMessage().getText().contains("Login was unsuccessful. Please correct the errors and try again."));
        }

        MyFunc.Bekle(1);
    }

    @DataProvider(name = "loginTestData")
    public Object[][] loginData(){
        return new Object[][]{{"testng1@gmail.com", "123qweasd"},
                {"testng2@gmail.com", "123qweasd"},
                {"testng1@gmail.com", "qweasdzxc"},
                {"testng2@gmail.com", "qweasdzxc"}};
    }
}
