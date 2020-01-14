package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Mains extends BaseTest {
    @Test
    public void login() throws InterruptedException {
        // Enter the URL of your own created sample web page
        driver.get("https://github.com/login");

        WebElement email = driver.findElement(By.id("login_field"));
        email.sendKeys("usahu998@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Upen@54321");
        WebElement login = driver.findElement(By.name("commit"));
        login.click();
        Thread.sleep(5000);
        WebElement multibar = driver.findElement(By.xpath("//summary[@class='Header-link']//img[@class='avatar']"));
        multibar.click();
        Thread.sleep(5000);
        WebElement logout = driver.findElement(By.xpath("//button[@class='dropdown-item dropdown-signout']"));
        logout.click();

    }
}
