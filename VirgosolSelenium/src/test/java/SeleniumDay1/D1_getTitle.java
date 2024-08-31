package SeleniumDay1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1_getTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.tr/");

        // Doğru sayfada çalışıp çalışmadığımızı kontrol etmek için anlık çalıştığımız sayfanın title'ını çekiyoruz
        // url'in üzerinde bulunan title'ı yazdırıyoruz.
        // f12 html kodları arasında head --> title içindeki yazan yazıyı yazdırır
        String title = driver.getTitle();
        System.out.println("title = " + title);

        // Doğru sayfada çalışıp çalışmadığımızı kontrol etmek için anlık çalıştığımız sayfanın url'ini çekiyoruz
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);



        driver.quit();
    }
}
