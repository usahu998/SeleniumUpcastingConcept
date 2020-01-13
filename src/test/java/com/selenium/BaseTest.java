package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTest {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "/home/user/IdeaProjects/Selenium/src/Driver/chromedriver");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void close()
    {
        driver.close();
    }
}
