package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hii");

        //setting the path of the chrome driver executable
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //Enter the url
        driver.get("https://www.google.com");

        //Get the title of the google page and print it on the console
        String title = driver.getTitle();
        System.out.println("the title of the page is :" + title);

        //Get the URL of the google page and print it on the console
        String currentUrl = driver.getCurrentUrl();
        System.out.println("the URL of the page is :" + currentUrl);

        //Get the source code of the google page and print it on the console
        String pageSource = driver.getPageSource();
        System.out.println("the source code of the page is :" + pageSource);

        //Halt the program execution for 2 seconds
        Thread.sleep(2000);

        // Close the browser
        driver.close();
    }
}
