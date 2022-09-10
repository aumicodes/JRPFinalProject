package Pages.XYZBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {

    public static WebDriver driver;

    public static void launchUrlOnNewWindow(String url) {
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void quitWindows() {
        driver.quit();
    }
    public static WebDriver getDriver() {return driver;}
}

