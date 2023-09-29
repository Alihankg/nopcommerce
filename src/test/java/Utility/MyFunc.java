package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class MyFunc {

    public static void Bekle(int sn){

        try {
            Thread.sleep(sn* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    // Çoğu yerde aynı mesaj doğrulaması kullanıldığı için bu bölümü
    // ortak fonksiyonların yer aldığı MyFunc a taşındı.
    public static void successMessageValidation(){
        WebElement msgLabel=BaseDriver.driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));
    }

    public static int randomGenerator(int sinir){
        return (int)(Math.random()*sinir);
    }

    public static boolean listContainsString(List<WebElement> list, String aranacakKelime){
        boolean bulundu=false;
        for(WebElement e: list){
            if (e.getText().equalsIgnoreCase(aranacakKelime))
            {
                bulundu=true;
                break;
            }
        }

        return bulundu;
    }

    public static WebElement isClickable(By e){
        return BaseDriver.wait.until(ExpectedConditions.elementToBeClickable(e));
    }
    public static WebElement isPresent(By e){
        return BaseDriver.wait.until(ExpectedConditions.presenceOfElementLocated(e));
    }
}