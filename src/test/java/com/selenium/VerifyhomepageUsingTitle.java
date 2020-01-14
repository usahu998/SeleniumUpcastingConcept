package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyhomepageUsingTitle extends BaseTest {

    @Test
    public void testVerifyHomePageUsingTitle() throws InterruptedException {
        driver.get("https://github.com/login");
        driver.findElement(By.id("login_field")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("manager");
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        Thread.sleep(3000);
        String expectedTitle = "Enter Time";
        String actualTitle = driver.getTitle();
        //If actual title contains "Enter Time" text then home page is displayed.
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Home page is displayed");
        } else {
            System.out.println("Home page is NOT displayed");

        }
    }
}
