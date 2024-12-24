package com.practise.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HeadlessChrome {
    WebDriver driver;

    @BeforeSuite
    public void startChromeBrowser() {
        WebDriverManager.chromedriver().setup();

       ChromeOptions options = new ChromeOptions();
       options.addArguments("--headless=new");

        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
    }
@Test
    public void openUrl() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        //Thread.sleep(2000);
    System.out.println(driver.getTitle());
        driver.manage().window().maximize();

    }
@AfterSuite
    public void closeChromeBrowser(){
        driver.close();

    }


}