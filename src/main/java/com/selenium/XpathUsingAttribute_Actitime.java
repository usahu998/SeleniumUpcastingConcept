package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingAttribute_Actitime {
    public static void main(String[] args) throws InterruptedException {
        //setting the path of the chrome driver executable
        System.setProperty("webdriver.chrome.driver", "/home/user/IdeaProjects/Selenium/src/Driver/chromedriver");

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

//Enter the url of actiTIME application
        driver.get("https://github.com/login");
//xpath using multiple attributes
        String xp = "//input[@id='login_field']";
        Thread.sleep(2000);
//Enter admin into username text box
        driver.findElement(By.xpath(xp)).sendKeys("admin");
        Thread.sleep(2000);
//find password element using xpath by attribute and enter manager in to password textbox.
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("manager");
        Thread.sleep(2000);
//find an image on the web page whose attributes (src)contains a value called timer
  //      WebElement clock = driver.findElement(By.xpath("//img[contains(@src,'timer')]"));
//store the width value of the clock image into a variable called widthValue
 //       String widthValue = clock.getAttribute("width");
//Print the width of the clock image
  //      System.out.println("the width is :"+widthValue);
//Print the height of the clock image
  //      System.out.println("the height of the clock element is : "+ clock.getAttribute("height"));
//xpath using text() function
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        Thread.sleep(2000);
//xpath using contains() function and text() function
  //      driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
    //    Thread.sleep(2000);
        driver.close();
    }

}
