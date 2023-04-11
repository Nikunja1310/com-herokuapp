package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {

    static String browser = "Chrome";
    static String baseURL = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Wrong Browser name.");
        }

        //open URL
        driver.get(baseURL);
        //maximise
        driver.manage().window().maximize();
        //implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get and print title
        System.out.println(driver.getTitle());

        //Url
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //page
        System.out.println("Page source : "+ driver.getPageSource());
        //Find username field element and enter the same
        driver.findElement(By.id("username")).sendKeys("Nsenj");
        //Find Password field element and enter the same
        driver.findElement(By.id("password")).sendKeys("Nik123");
        //Close the Browser
        driver.close();
    }
}
