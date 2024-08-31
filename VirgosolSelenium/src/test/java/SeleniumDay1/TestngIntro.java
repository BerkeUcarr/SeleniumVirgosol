package SeleniumDay1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngIntro {

    @Test
    public void test1(){
        System.out.println("İlk test case");
    }

    @Test
    public void test2(){
        System.out.println("İkinci test case");
    }

    @Test
    public void title1(){

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        String expectedResult = "Amazon.com. Spend less. Smile more.";
        System.out.println("expectedResult = " + expectedResult);

        String actualResult = driver.getTitle();
        System.out.println("actualResult = " + actualResult);

        // contains'i arada boşluk var mı nokta eksik mi gibi tam eşleşmeler olmazsa
        // test passed geçmesi gerekirse kullanıyoruz
        // tam eşitlikten söz ediyorsak equals kullan
        // aynı şeyleri içermesi gerekiyorsa contains kullan
        if (actualResult.contains(expectedResult)){
            System.out.println("pass");
        } else{
            System.out.println("fail");
        }

        driver.close();

    }

    @Test
    public void currentUrl(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr/");

        // Doğru sayfada çalışıp çalışmadığımızı kontrol etmek için anlık çalıştığımız sayfanın url'ini çekiyoruz
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        driver.quit();

    }
}
