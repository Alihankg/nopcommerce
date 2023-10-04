import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class US_05_Gift01 extends BaseDriver {

  @Test
  @Parameters({"mesaj"})

    public void hediye(String arananKelime){
      driver.get("https://demo.nopcommerce.com/");
      POM pom=new POM();

      pom.GiftCarts.click();
      MyFunc.Bekle(2);
      pom.picture.click();
      pom.Name.sendKeys(arananKelime);
      pom.Email.sendKeys("musab773@pbridal.com");
      MyFunc.Bekle(2);
      pom.YourName.sendKeys("Taş");
      pom.YourEmail.sendKeys("kixiwop773@pbridal.com");
      pom.Message.sendKeys("testNg");
      MyFunc.Bekle(2);
      pom.AdToCard.click();

      WebElement shopping=driver.findElement(By.linkText("shopping cart"));
      Assert.assertTrue(shopping.getText().toLowerCase().contains("shopping"),"aranan mesaj görüntülenemedi");




  }

}
