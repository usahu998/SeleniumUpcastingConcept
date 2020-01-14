package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators extends BaseTest {
    @Test
    public void testLocators() throws InterruptedException {

    // Enter the URL of your own created sample web page
        driver.get("https://github.com/login");

        // Used “id” locator to find USERNAME text box
        WebElement unTB = driver.findElement(By.id("login_field"));

        //Clear the existing value present in the text box
        unTB.clear();

        // Enter value into the USERNAME text box
        unTB.sendKeys("usahu998");

        // Used “name” locator to find Password text box
        WebElement passTB = driver.findElement(By.name("password"));

        //Clear the existing value present in the text box
        passTB.clear();

        //Halt the program execution for 2 seconds
        Thread.sleep(2000);

        // Enter value into the Password text box
        passTB.sendKeys("Upen@54321");

        // Find the address of ActiTIME Link and click
        driver.findElement(By.name("commit")).click();
        Thread.sleep(2000);
        
    }
}
