package com.practise.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LocateByPartialLinkText {


    WebDriver driver;

    @BeforeSuite

    public void startChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test

    public void openUrl () throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        Thread.sleep(15000);


       // WebElement mobile = driver.findElement(By.name("mobile"));
       // mobile.sendKeys("01799827715");
        //Only for data sendKeys

        WebElement bad = driver.findElement(By.partialLinkText("Bad"));
        //Only for link linkText
        bad.click();
        Thread.sleep(5000);

    }
    @AfterSuite
    public void closeChromeDriver() {
        driver.close();

    }


}
