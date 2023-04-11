package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-3 - Project Name: com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 */
public class ChromeBrowser {

    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //launch Chrome
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseUrl);
        //maximise
        driver.manage().window().maximize();
        //impilcit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get and print Title
        System.out.println(driver.getTitle());

        //Current URL and print
        System.out.println("Current URL" + driver.getCurrentUrl());

        //Get and print page Source
        System.out.println("Page Source : " + driver.getPageSource());

        //Find username field element and enter the same
        driver.findElement(By.id("username")).sendKeys("Nsenj");
        //Find Password field element and enter the same
        driver.findElement(By.id("password")).sendKeys("Nik123");


        //Close the Browser
        driver.close();

    }
}
