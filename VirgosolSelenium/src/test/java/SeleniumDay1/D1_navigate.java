package SeleniumDay1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class D1_navigate {

    // throws kullanmasının nedeni try catch kullanmamak için bir kısayol
    // Thread.sleep(süre) kullandığımızda otomatik yazdırıyoruz.
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverManager.chromedriver().create();
        // manage window sayfayı tam sayfa halinde açar
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        // sayfalar arası geçişleri rahat görebilmek için thread koyuyoruz
        Thread.sleep(1000);

        driver.navigate().to("https://www.amazon.com.tr/");
        Thread.sleep(1000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);

        driver.quit();

    }
}
