package Intialization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Setup {
    public static WebDriver driver = null;

    public static WebDriver SetupDriver(String platform, String url, String browser) {
        if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/tazzalam/eclipse-workspace/WeekDaysJava/Google/src/main/resources/chromedriver/chromedriver");
        } else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/tazzalam/eclipse-workspace/WeekDaysJava/Google/src/main/resources/chromedriver/chromedriver.exe");

        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
        return driver;

    }


    @Test

    public static void FacebookLogin() {


        SetupDriver("Mac", "https://www.facebook.com", "chrome");

        driver.findElement(By.xpath("//*[@id= 'email']")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id= 'pass']")).sendKeys("password");

        driver.findElement(By.xpath("//*[@value= 'Log In']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        driver.quit();
    }

    @Test
    public void messegngerRedirect() {

        SetupDriver("mac", "https://www.facebook.com", "chrome");
        driver.findElement(By.linkText("Messenger")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        driver.quit();

    }
}
