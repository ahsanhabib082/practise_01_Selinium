package com.practise.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CrossBrowserInit {

    String url="  ";
    WebDriver driver;


    @BeforeSuite
    public void startBrowser() {

        String browser=System.getProperty("browser","");
        if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
            driver.manage().window().maximize();
        }
        else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            driver.manage().window().maximize();
        }
        else {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
        }

    }
    @Test

    public void openUrl () throws InterruptedException {
        driver.get("https://www.cricbuzz.com/ ");
        Thread.sleep(15000);


    }
    @AfterSuite
    public void closeChromeDriver() {
        driver.close();

    }

}
