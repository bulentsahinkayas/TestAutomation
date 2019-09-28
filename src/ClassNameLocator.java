
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassNameLocator {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        invokeChromeBrowser();
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Bulent");
        Thread.sleep(3000);
        driver.findElement(By.name("lastname")).sendKeys("Sahin");
    }
    public static void invokeChromeBrowser() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\sahinkayasi\\Desktop\\JavaProject\\Selenium\\chromedriver.exe");
    }
}
