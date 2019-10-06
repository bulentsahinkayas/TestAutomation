import org.openqa.selenium.WebDriver;

public class ActionClassSendKeys {
    public static void main(String[] args) {
        BrowserMethod myBrowser=new BrowserMethod();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://www.amazon.com");

    }
}
