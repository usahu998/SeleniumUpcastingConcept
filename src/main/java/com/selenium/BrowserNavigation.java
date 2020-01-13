package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        //setting the path of the chrome driver executable
        System.setProperty("webdriver.chrome.driver", "/home/user/IdeaProjects/Selenium/src/Driver/chromedriver");

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //Enter the url
        driver.get("http://www.google.com");
        driver.navigate().to("http://www.gmail.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();
    }
}
