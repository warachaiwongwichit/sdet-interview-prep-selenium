import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Question: What are the different types of navigation commands?

public class _12 extends _001{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.get("https://etsy.com");

        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
//        driver.navigate().to("https://ebay.com");

        sleep(2000);
        driver.close();
    }
}
