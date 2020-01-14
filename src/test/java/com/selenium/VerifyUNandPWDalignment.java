package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyUNandPWDalignment extends BaseTest{

    @Test
    public void testVerifyUNandPWDalignment() {
    driver.get("https://github.com/login");
        WebElement unTB = driver.findElement(By.id("login_field"));
        int un_x = unTB.getLocation().getX();
        int un_width = unTB.getSize().getWidth();
        int un_height = unTB.getSize().getHeight();
        WebElement pwTB = driver.findElement(By.name("password"));
        int pw_x = pwTB.getLocation().getX();
        int pw_width = pwTB.getSize().getWidth();
        int pw_height = pwTB.getSize().getHeight();
        if (un_x == pw_x && un_width==pw_width && un_height==pw_height) {
            System.out.println("Username and password text box are aligned");
        } else {
            System.out.println("Username and password text box are NOT aligned");
        }
    }
}
