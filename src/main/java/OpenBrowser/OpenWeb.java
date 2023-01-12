package OpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OpenWeb {
    public static WebDriver driver;
    public static void main(String[] args) {
       openAll();
    }
    public static void openAll(){
        openBrowser();
        openUrl();
        maximizeBrowser();
    }
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "F:\\Smart Drive Project Automation\\SmartDriveProject\\Web Driver\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static void openUrl() {
        try {
            // Open URL
            driver.get("https://staging.smartdrivers.ch");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void maximizeBrowser(){
        // Maximize the Browser
        driver.manage().window().maximize();
    }
    public static void implicitlyWaits() {
        //Implicitly Waits
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}


