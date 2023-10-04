package AC_01_04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


    public class US_04_TabMenu01 {
        private WebDriver driver;
        @BeforeClass
        public void setUp1() {

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        @Test()
        void tabMenuTest() {
            driver.get("https://demo.nopcommerce.com/");

            // Beklenen menü öğelerini tanımla
            List<String> tabMenuList = new ArrayList<>(Arrays.asList("Computers", "Electronics", "Apparel", "Digital downloads", "Books", "Jewelry", "Gift Cards"));
            List<WebElement> tabMenu = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li"));

            // Her menü öğesini doğrula
            for (int i = 0; i < tabMenu.size(); i++) {
                Assert.assertTrue(tabMenu.get(i).getText().contains(tabMenuList.get(i)));
            }
            System.out.println("Tab Menü İsimleri:");
            for (WebElement element : tabMenu) {
                System.out.println(element.getText());
            }
        }
        @Test()
        public void menuAdlaridogrulamaislemi() {
            // Web sayfasını aç
            driver.get("https://demo.nopcommerce.com/");

            // Beklenen menü öğelerini tanımla
            List<String> beklenenMenuItem = new ArrayList<>(Arrays.asList(
                    "Computers", "Electronics", "Apparel", "Digital downloads", "Books", "Jewelry", "Gift Cards"));

            // Menü öğelerini bul
            List<WebElement>gercekMenuOgeleri = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li"));

            // Her menü öğesini doğrula
            for (int i = 0; i < gercekMenuOgeleri.size(); i++) {
                String gercekMenuOgeleriText = gercekMenuOgeleri.get(i).getText();
                String beklenenMenuItemText = beklenenMenuItem.get(i);
                Assert.assertTrue(gercekMenuOgeleriText.contains(beklenenMenuItemText));

                // Her menü öğesine tıkla
                gercekMenuOgeleri.get(i).click();
                MyFunc.Bekle(2);

                // Sayfa başlığını kontrol et
                String pageTitle = driver.getTitle();
                System.out.println("Sayfa Başlığı: " + pageTitle);

                // Şu anki sayfanın URL'sini al
                String currentUrl = driver.getCurrentUrl();
                System.out.println("Sayfa URL'si: " + currentUrl);

                // İşlemler veya doğrulamalar burada yapılabilir
                // Örneğin, sayfa içeriğini kontrol etmek için WebElement bulunabilir veya diğer test senaryolarını uygulayabilirsiniz.

                // Sayfadan geri dön
                driver.navigate().back();

                // Yeniden menü öğelerini bul
                gercekMenuOgeleri = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li"));
            }
        }

        @AfterClass
        public void tearDown() {
            // Tarayıcıyı kapat
            driver.quit();
        }
    }



