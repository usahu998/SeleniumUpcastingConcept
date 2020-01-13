package com.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CaptureScreenshot_ActiTIMEPage extends Main {

    public static void main(String[] args) throws IOException {
        //Creating an object of Date class
        Date date = new Date();

        //Printing the actual date
        String date1 = date.toString();
        System.out.println(date1);

        //replacing the colon present in the date timestamp format to "_" using replaceAll()
        //method of String class
        String date2 = date1.replaceAll(":", "_");
        System.out.println(date2);

        //setting the path of the chrome driver executable
        System.setProperty("webdriver.chrome.driver", "/home/user/IdeaProjects/Selenium/src/Driver/chromedriver");

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //Enter the url
        driver.get("https://facebook.com");

        //Typecasting the driver object to TakesScreenshot interface type.
        TakesScreenshot ts = (TakesScreenshot) driver;

        //getting the source file using getScreenshotAs() method and storing in a file
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        /*Created a folder called "screenshot" in the project directory
        Created another file by concatenating the date value which has "_" in it
        (Underscore is the accepted character while creating a file in the project )*/
        File destFile = new File("/home/user/IdeaProjects/Selenium/src/main/resources/ScreenShot/" + date2 + "__actiTIMELoginPage.png");
        /*copyFile() method is a static method present in FileUtils class of JAVA
        storing the screenshot in the destination location*/
        FileUtils.copyFile(srcFile,destFile);

        //closing the browser
        driver.close();
    }
}
