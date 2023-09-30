package Utility;


import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static final org.apache.logging.log4j.Logger logger4j= LogManager.getLogger();

    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;

    @BeforeTest
    public void baslangicIslemleri(){
        Logger logger= Logger.getLogger(""); // output yapılan logları al.
        logger.setLevel(Level.SEVERE); // sadece ERROR ları göster

        driver = new ChromeDriver(); // jenkins deyken : sen head olmadan yani hafızada çalış
        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @AfterTest
    public void bitisIslemleri(){ // tearDown
        MyFunc.Bekle(5);
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod(){
        //System.out.println("test metodu başladı");
        logger4j.info("test metodu başladı");
        logger4j.warn("warning mesaj test başladı");
    }

    @AfterMethod
    public void afterMethod(ITestResult sonuc){ // tesin sonuç ve isim bilgisini olduğu değişkeni vereyim mi
        //System.out.println("test metodu bitti");
        logger4j.info(sonuc.getName() +" test metodu bitti " + (sonuc.getStatus()==1 ? " passed " : "fail") );
        logger4j.warn("warning mesaj test bitti");

        // excel yazabileceksin
        // dosyaya da yazabileceksin
    }


}