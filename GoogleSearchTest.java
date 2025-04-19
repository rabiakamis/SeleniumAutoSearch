import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; //Web tarayıcıları üzerinde otomatik testler yapmanızı sağlayan arayüzdür
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
    public static void main(String[] args) {
        // WebDriverManager ile ChromeDriver'ı otomatik olarak indir ve başlat
        WebDriverManager.chromedriver().setup();

        // WebDriver'ı başlat
        WebDriver driver = new ChromeDriver();

        // 1. Google'a git
        driver.get("https://www.google.com");

        // 2. Arama kutusunu bul (nesne:searchBox)
        WebElement searchBox = driver.findElement(By.name("q"));

        // 3. "Selenium" yaz ve entera bas
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        // 4. Bekle ve sonra kapat
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
