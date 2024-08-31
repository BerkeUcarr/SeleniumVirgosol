package SeleniumDay1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1_driver {

    public static void main(String[] args) throws InterruptedException {

        // chrome'da google aç kapat
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.close(); // son açtığı sayfayı kapatır

        // edge üzerinden amazon sitesine girmek için
        driver = WebDriverManager.edgedriver().create();
        driver.get ("https://www.amazon.com/");

        // Sayfayı büyütüyoruz
        // Bu sayede sayfada normalde görmemiz gereken bir şeyi görmemezlik yapıp testin patlamasını engelliyoruz
        driver.manage().window().maximize();

        // 3 saniye koyuyoruz ki sayfa hemen açılıp kapanmasın
        // Önce akıllı bekleme methodu kullan olmazsa sıkıntı yaşarsan bunu kullan
        Thread.sleep(3000);
        driver.quit(); // tüm objeleri kapatır
    }

}
