package com.practise.browsercommand;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrowserCommandExamples {


    String url = "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
    WebDriver driver;


    @BeforeSuite
    public void startChromeBrowser() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
    }

@Test
    public void getCurrentUrl() throws InterruptedException {
        driver.get(url);
        Thread.sleep(5000);
        String currentURL = driver.getCurrentUrl() ;
        System.out.println(currentURL);

        if(url.equals(currentURL)) {
            System.out.println("Current URl is same as the mentioned url");
        }else{
            System.out.println("Current URl is not same as the mentioned url");
        }
    }

@AfterSuite
    public void closeChromeBrowser() {
        //driver.close(); only one browser not whole chrome
          driver.quit();
    }
}
