package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Mains extends BaseTest {
    @Test
    public void Login() throws InterruptedException {

        // Enter the URL of your own created sample web page
        driver.get("https://github.com/login");

        WebElement Email = driver.findElement(By.id("login_field"));
        Email.sendKeys("usahu998@gmail.com");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Upen@54321");
        WebElement Login = driver.findElement(By.name("commit"));
        Login.click();
        Thread.sleep(5000);
        WebElement MultiBar = driver.findElement(By.xpath("//summary[@class='Header-link']//img[@class='avatar']"));
        MultiBar.click();
        Thread.sleep(5000);
        WebElement Logout = driver.findElement(By.xpath("//button[@class='dropdown-item dropdown-signout']"));
        Logout.click();

    }
}
