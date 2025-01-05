package com.practise.mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Hover {


    WebDriver driver;

    @BeforeSuite

    public void startChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test

    public void openUrl () throws InterruptedException {
        driver.get("http://www.automationpractice.pl/index.php");
        Thread.sleep(15000);


        WebElement element = driver.findElement(By.xpath("//a[@title='Women']"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        Thread.sleep(5000);


        WebElement dress = driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]"));
        dress.click();
        Thread.sleep(5000);

    }
    @AfterSuite
    public void closeChromeDriver() {
        driver.close();

    }


}
