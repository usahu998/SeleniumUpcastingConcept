package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Keyboard_Mouse_Operations {
    public static void main(String[] args) throws InterruptedException, AWTException {
        //setting the path of the chrome driver executable
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
//2. enter the url -
        driver.navigate().to("http://www.google.com");
        Thread.sleep(5000);
//Creating an object of Robot Class
        Robot r = new Robot();
//move the mouse by x and y coordinate
        r.mouseMove(300, 500);
//press ALT key from keyboard
     //   r.keyPress(KeyEvent.VK_ALT);
//press F key from keyboard
        r.keyPress(KeyEvent.VK_F);
//Release F key from keyboard
        r.keyRelease(KeyEvent.VK_F);
//Release Alt key from keyboard
        //   r.keyRelease(KeyEvent.VK_ALT);
        Thread.sleep(3000);
//Press W key from keyboard to open a new private window
        //    r.keyPress(KeyEvent.VK_W);
//Release W key from keyboard
        //    r.keyRelease(KeyEvent.VK_W);
        Thread.sleep(3000);
// It will close only the current browser window
        driver.close();
// It will close all the browser windows opened by Selenium
        driver.quit();
    }

}
