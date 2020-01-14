package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardMouseOperations extends BaseTest {
    @Test
    public void testKeyboardMouseOperations() throws InterruptedException, AWTException {
        //2. enter the url -
        driver.navigate().to("http://www.google.com");
        Thread.sleep(5000);
        //Creating an object of Robot Class
        Robot robot = new Robot();

        //move the mouse by x and y coordinate
        robot.mouseMove(300, 500);

        //press ALT key from keyboard
        //   r.keyPress(KeyEvent.VK_ALT);
        //press F key from keyboard
        robot.keyPress(KeyEvent.VK_F);

        //Release F key from keyboard
        robot.keyRelease(KeyEvent.VK_F);

        //Release Alt key from keyboard
        //   r.keyRelease(KeyEvent.VK_ALT);
        Thread.sleep(3000);

        //Press W key from keyboard to open a new private window
        //    robot.keyPress(KeyEvent.VK_W);

        //Release W key from keyboard
        //    robot.keyRelease(KeyEvent.VK_W);
        Thread.sleep(3000);
    }
}
