import Utility.BaseDriver;
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


public class US_04_TabMenü02 extends BaseDriver {

    @Parameters("element")
    @Test
    public void TabMenu2(String element){

        POM po=new POM();
        driver.get("https://demo.nopcommerce.com/");

        List<WebElement>TabMenu=driver.findElements(By.cssSelector("[class='top-menu notmobile']>li"));

        for (int i = 0; i < TabMenu.size(); i++) {
            WebElement Tabb=TabMenu.get(i);
            System.out.println(Tabb.getText());
        }

        po.computers.click();
        po.electronics.click();
        po.apparel.click();
        po.search.sendKeys(element, Keys.ENTER);

        int randomSelect = POM.RandomAtama(po.getProductTitle().size());
        wait.until(ExpectedConditions.urlContains(element));
        List<String> stringList = new ArrayList<>();
        for (WebElement elements : po.getProductTitle()) {
            stringList.add(elements.getText());
        }
        new Actions(driver).scrollByAmount(200, 0);
        po.getProductTitle().get(randomSelect).click();
        Assert.assertTrue(stringList.contains(po.getProduct().getText()), "Bulunamadı");
    }



    }



