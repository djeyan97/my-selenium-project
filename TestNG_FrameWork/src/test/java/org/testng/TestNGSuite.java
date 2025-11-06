package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestNGSuite {
    WebDriver driver;
    long startTime;
    long endTime;

    @BeforeSuite
    public void beforeTest() {
        startTime = System.currentTimeMillis();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Drivers\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogle(){
        driver.get("https://www.google.com");
    }

    @Test
    public void openBing() {
        driver.get("https://www.bing.com");
    }

    @AfterSuite
    public void afterTest() {
        driver.quit();
        endTime = System.currentTimeMillis();
        long TotalTime = endTime - startTime;
        System.out.println("Total Time : " + TotalTime);
    }


    }



