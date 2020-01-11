package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/user/IdeaProjects/Selenium/src/Driver/chromedriver");
        driver = new ChromeDriver();
       // driver.get("https://www.facebook.com/index.php?next=https%3A%2F%2Fwww.facebook.com%2Fgettingstarted%2F%3Fstep%3Dfriend_requests");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void close()
    {
        driver.close();
    }
}
