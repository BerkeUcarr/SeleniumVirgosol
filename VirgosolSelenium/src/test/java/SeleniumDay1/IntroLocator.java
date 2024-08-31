package SeleniumDay1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IntroLocator {

    @Test
    public void testTask() throws InterruptedException {

        WebDriver driver = WebDriverManager.edgedriver().create();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        WebElement inputBoxElement = driver.findElement(By.id("twotabsearchtextbox"));
        inputBoxElement.sendKeys("watch");
        Thread.sleep(2000);

        driver.quit();

    }

    @Test
    public void testName() throws InterruptedException {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement genderInputBox = driver.findElement(By.name("gender"));

        if(genderInputBox != null) {
            System.out.println("Element bulundu");
        }

        Thread.sleep(2000);

        driver.quit();

    }

    @Test
    public void testLink() throws InterruptedException {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/accessing-link.html");

        WebElement linkText = driver.findElement(By.linkText("go here"));

        linkText.click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        // normalde "click here" yazıyor
        // partial kullandığımız için unique kısmı yazsak yeterli olacaktır
        WebElement partialLinkText = driver.findElement(By.partialLinkText("click"));

        partialLinkText.click();
        Thread.sleep(2000);

        driver.quit();

    }

    // CSS
    @Test
    public void testCSS() throws InterruptedException {

        WebDriver driver = WebDriverManager.edgedriver().create();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        WebElement inputBoxElement = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        inputBoxElement.sendKeys("watch");
        Thread.sleep(2000);

        driver.quit();

    }

    //xPath
    @Test
    public void testxPath() throws InterruptedException {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement nameInputBox = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));

        if(nameInputBox != null) {
            System.out.println("Element bulundu");
        }

        Thread.sleep(2000);

        driver.quit();

    }

}
