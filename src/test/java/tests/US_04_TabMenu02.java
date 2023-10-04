package tests;

import Utility.BaseDriver;
import helpers.POM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class US_04_TabMenu02 extends BaseDriver {
    @Parameters("element")
    @Test
    public void TabMenu2(String element) {

        POM pom = new POM();
        driver.get("https://demo.nopcommerce.com/");

        pom.computers.click();
        pom.electronics.click();
        pom.apparel.click();
        pom.search.sendKeys(element, Keys.ENTER);

        int randomSelect = POM.RandomAtama(pom.productTitle.size());
        wait.until(ExpectedConditions.urlContains(element));
        List<String> stringList = new ArrayList<>();
        for (WebElement elements : pom.productTitle) {
            stringList.add(elements.getText());
        }
        new Actions(driver).scrollByAmount(200, 0);
        pom.productTitle.get(randomSelect).click();
        Assert.assertTrue(stringList.contains(pom.product.getText()), "Bulunamadı");
    }
}



