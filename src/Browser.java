import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        String expectedValue="Sizin İçin Buradayız!";
        invokeChromeBrowser();
        driver.manage().window().maximize();
        driver.get("http://www.flypgs.com");
        driver.findElement(By.xpath("//*[@id='divHeaderCurrency']/div/div/div/label")).click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("BİZE YAZIN")).click();
        Thread.sleep(5000);
        System.out.println("Vlidation "+isTextTrue(expectedValue));
    }

    public static void invokeChromeBrowser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sahinkayasi\\Desktop\\JavaProject\\Selenium\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    public static boolean isTextTrue(String expectedValue){
        String resultValue=driver.findElement(By.xpath("//*[@id='sf-recase-query']/h2")).getText();
        return resultValue.equals(expectedValue);
    }
}
