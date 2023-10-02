package AC_01_04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class US_06_Order01 extends BaseDriver {
    @Test()
    void US_06_Order() {

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        MyFunc.Bekle(1);
        Actions actions = new Actions(driver);
        WebElement computers = driver.findElement(By.xpath("(//a[text()='Computers '])[1]"));
        computers.click();
        MyFunc.Bekle(1);

        WebElement desktops = driver.findElement(By.xpath("(//div[@class='sub-category-item'][1])"));
        desktops.click();
        MyFunc.Bekle(1);

        WebElement buildComputer = driver.findElement(By.xpath("//a[text()='Build your own computer']"));
        buildComputer.click();
        MyFunc.Bekle(1);

        WebElement ramSelect = wait.until(ExpectedConditions.elementToBeClickable(By.id("product_attribute_2")));
        ramSelect.click();
        MyFunc.Bekle(1);

        List<WebElement> ramOptions = driver.findElements(By.cssSelector("select[id='product_attribute_2']>option"));
        ramOptions.get((int) (Math.random() * ramOptions.size()-1)+1).click();
        MyFunc.Bekle(1);

        List<WebElement> hdd = driver.findElements(By.xpath("//input[@name='product_attribute_3']"));
        hdd.get((int) (Math.random() * hdd.size())).click();
        MyFunc.Bekle(1);

        WebElement addToCart = driver.findElement(By.id("add-to-cart-button-1"));
        addToCart.click();
        MyFunc.Bekle(1);

        WebElement verificationMessage = driver.findElement(By.xpath("//p[text()='The product has been added to your ']"));
        MyFunc.Bekle(1);
        Assert.assertEquals(verificationMessage.getText(), "The product has been added to your shopping cart");

        System.out.println(" " +verificationMessage.getText());

        driver.quit();

    }
}
