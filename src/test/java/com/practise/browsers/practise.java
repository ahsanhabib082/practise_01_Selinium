package com.practise.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class practise {
    WebDriver driver;

    @BeforeSuite

    public void startChromeDriver() {
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

@Test

    public void openUrl () throws InterruptedException {
        driver.get("https://www.cricbuzz.com/");
        Thread.sleep(15000);


    }
@AfterSuite
    public void closeChromeDriver() {
        driver.close();

    }


}
