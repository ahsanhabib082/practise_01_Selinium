package com.practise.webelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.nio.channels.ScatteringByteChannel;

public class IsDisplayedNotMethod {


    WebDriver driver;

    @BeforeSuite

    public void startChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test

    public void openUrl () throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        Thread.sleep(15000);


       // WebElement mobile = driver.findElement(By.name("mobile"));
       // mobile.sendKeys("01799827715");
        //Only for data sendKeys

        WebElement element = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        //Only for link linkText

        try {
            if (element.isDisplayed()) {
                System.out.println(element.getCssValue("color"));
                Thread.sleep(15000);
            }
        }
        catch (Exception e) {
            System.out.println("element is not displayed");
        }
    }




    @AfterSuite
    public void closeChromeDriver() {
        driver.close();

    }


}
