package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class VerifyFB_Usernamefield_lessthanMobileNumberField {
    public static void main(String[] args) {
        //setting the path of the chrome driver executable
        System.setProperty("webdriver.chrome.driver", "/home/user/IdeaProjects/Selenium/src/Driver/chromedriver");

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        WebElement unTB = driver.findElement(By.id("email"));
        int username_width = unTB.getSize().getWidth();
        System.out.println(username_width);
        //Identify the mobile number text box
        WebElement mobileNumTB = driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number or email address')]"));
        int mobNumWidth = mobileNumTB.getSize().getWidth();
        System.out.println(mobNumWidth);
        //Compare the width of both username and mobilenumber text box
        if (username_width==mobNumWidth) {

            System.out.println("Size of Both username and password fields are same" +username_width+" = " + mobNumWidth);
        }else{
            System.out.println("Size of username and password fields are NOT same that is : "
                    +username_width+" Not equals to " + mobNumWidth);
        }

        // It will close only the current browser window
        driver.close();

        // It will close all the browser windows opened by Selenium
        driver.quit();
    }

}
